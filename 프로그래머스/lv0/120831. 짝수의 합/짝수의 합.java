import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = (int)IntStream.rangeClosed(1, n).filter(x -> x % 2 == 0).sum();
        return answer;
    }
}