import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        HashMap<Integer, Double> map = new HashMap();
        Double total = 0.0;
        Double cnt = 0.0;
        Double fail = 0.0;
        
        for(int i = 1; i <= N; i++) {
            total = 0.0;
            cnt = 0.0;
            fail = 0.0;
            for(int j = 0; j < stages.length; j++) {
                if(i <= stages[j]) {
                    total++;
                }
                if(i == stages[j]) {
                    cnt++;
                }
            }
            
            if(total != 0 || cnt != 0) {
                fail = cnt / total;
            }
            map.put(i, fail);
        }
        
        ArrayList<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        answer = new int[key.size()];
        int i = 0;
        
        for(int item : key) {
            answer[i++] = item;
        }
        
    
        return answer;
    }
}