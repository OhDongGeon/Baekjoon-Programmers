import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 2;
        HashSet<Integer> set = new HashSet();
        
        while(n > 1) {
            if(n % cnt == 0) {
                n /= cnt;
                set.add(cnt);
            } else {
                cnt++;
            }
        }
        
        answer = new int[set.size()];
        
        int i = 0;
        for(int item : set) {
            answer[i++] = item;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}