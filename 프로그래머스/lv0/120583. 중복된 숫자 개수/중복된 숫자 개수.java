import java.util.stream.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = (int)IntStream.of(array).filter(x -> x == n).count();
        return answer;
    }
}