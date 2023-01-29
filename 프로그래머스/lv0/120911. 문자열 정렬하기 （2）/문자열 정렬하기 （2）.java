import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my = my_string.toLowerCase().split("");
        Arrays.sort(my);
        answer = String.join("", my);
        return answer;
    }
}