import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String[] arr = Long.toString(n).split("");
        answer = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            answer[arr.length - 1 - i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}