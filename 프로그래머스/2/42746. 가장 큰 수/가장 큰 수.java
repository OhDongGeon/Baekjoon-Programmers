import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(strArr, (o1, o2) -> 
            (o2 + o1).compareTo(o1+ o2)
        );
        
        String answer = String.join("", strArr);

        return answer.charAt(0) == '0' ? "0" : answer;
    }
}