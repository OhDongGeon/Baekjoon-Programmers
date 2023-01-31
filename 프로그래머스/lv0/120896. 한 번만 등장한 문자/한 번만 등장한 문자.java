import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] alphabet = s.split("");
        String chk = "";
        
        Arrays.sort(alphabet);
        
        for(int i = 0; i < alphabet.length; i++) {
            if(i != alphabet.length -1 && alphabet[i].equals(alphabet[i + 1])) {
                chk = alphabet[i];
                continue; 
            }
            if(alphabet[i].equals(chk)) {
               continue; 
            }
            answer += alphabet[i];
        }
        
        
        return answer;
    }
}