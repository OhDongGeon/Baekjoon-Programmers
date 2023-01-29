import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] num = Long.toString(n).split("");
        Arrays.sort(num, Comparator.reverseOrder());
        answer = Long.parseLong(String.join("", num));
        
        return answer;
    }
}