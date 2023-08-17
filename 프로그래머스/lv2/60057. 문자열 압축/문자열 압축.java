import java.util.*;

class Solution {
    public int solution(String s) {
        int sLength = s.length();
        int answer = sLength;
        
        for (int i = 1; i <= sLength / 2; i++) {
            String compress = "";
            String text = "";
            String preText = "";
            int cnt = 1;
            
            for (int j = 0; j < sLength; j+=i) {
                if (j + i < sLength) {
                    text = s.substring(j, j + i);
                } else {
                    text = s.substring(j, sLength);
                }
                
                if (preText.equals(text)) {
                    cnt++;
                } else {
                    if (cnt >= 2) {
                        compress += cnt;
                    }
                    compress += preText;
                    cnt = 1;
                    preText = text;
                }
            }
            if (cnt >= 2) {
                compress += cnt + preText;
            } else {
                compress += preText;
            }
            
            answer = Math.min(answer, compress.length());
        }
        
        return answer;
    }
}