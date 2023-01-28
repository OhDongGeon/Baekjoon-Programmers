import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String[] my = my_string.replaceAll("[a-z]", "").split("");
        Arrays.sort(my);

        answer = new int[my.length];

        for(int i = 0; i < my.length; i++) {
            answer[i] = Integer.parseInt(my[i]);
        }

        return answer;
    }
}