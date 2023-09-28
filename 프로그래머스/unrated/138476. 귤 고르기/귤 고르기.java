import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int item : tangerine) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }
        
        List<Integer> arr = new ArrayList<>(hm.keySet());
        
        Collections.sort(arr, (o1, o2) -> (
            hm.get(o2).compareTo(hm.get(o1))
        ));
        
        for (int item : arr) {
            answer++;
            k -= hm.get(item);
            
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}