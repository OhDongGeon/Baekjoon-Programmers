import java.util.stream.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.toLowerCase().split("");
        if( (int)Stream.of(arr).filter(x -> x.equals("y")).count() != (int)Stream.of(arr).filter(x -> x.equals("p")).count() ) {
            answer = false;
        }
        
        return answer;
    }
}