import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList();
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            if (n % i == 0) {
                arr.add(i);
            }
        }

        
        
        answer = new int[arr.size()];
            
        for(int item : arr) {
            answer[cnt++] = item;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}