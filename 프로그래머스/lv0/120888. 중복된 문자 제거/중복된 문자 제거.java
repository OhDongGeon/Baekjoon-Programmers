import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my = Stream.of(my_string.split("")).distinct().toArray(String[]::new);
        answer = String.join("", my);
        return answer;
    }
}