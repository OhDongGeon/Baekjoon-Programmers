import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = IntStream.of(arr).min().getAsInt();
        answer = IntStream.of(arr).filter(x -> x != min).toArray();
        if(answer.length == 0) {
            answer = new int[] {-1};
        }
        return answer;
    }
}