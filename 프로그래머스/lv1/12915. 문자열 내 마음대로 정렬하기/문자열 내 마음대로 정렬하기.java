import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int idx = strings.length;
        String[] answer = new String[idx];
        
        for (int i = 0; i < idx; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(answer);
        
        for (int i = 0; i < idx; i++) {
            answer[i] = answer[i].substring(1);
        }
        
        
        return answer;
    }
}