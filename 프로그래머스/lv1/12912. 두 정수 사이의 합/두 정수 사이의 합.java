import java.util.stream.*;
class Solution {
    static long answer = 0;
    
    public long solution(int a, int b) {
        if((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000)) {
            LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).forEach(x -> answer += x);
        }
        
        return answer;
    }
}