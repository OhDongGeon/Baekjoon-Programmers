import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] before_arr = before.split("");
        String[] after_arr = after.split("");
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        if(String.join("", before_arr).equals(String.join("", after_arr))) {
            answer = 1;
        }
        
        return answer;
    }
}