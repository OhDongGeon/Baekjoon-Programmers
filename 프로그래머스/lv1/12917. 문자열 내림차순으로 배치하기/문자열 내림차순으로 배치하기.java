import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] desc = s.split("");
        
        Arrays.sort(desc, Collections.reverseOrder());
        
        answer = String.join("", desc);
        
        return answer;
    }
}