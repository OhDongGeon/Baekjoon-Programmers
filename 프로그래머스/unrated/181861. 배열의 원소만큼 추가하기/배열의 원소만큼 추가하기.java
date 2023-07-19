import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            idx += arr[i];
        }
        
        int[] answer = new int[idx];
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            for (int j = 0; j < num; j++) {
                answer[cnt++] = arr[i];
            }
        }
        
        return answer;
    }
}