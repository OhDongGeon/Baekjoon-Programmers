import java.util.stream.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        answer = IntStream.of(arr).average().getAsDouble();
        return answer;
    }
}