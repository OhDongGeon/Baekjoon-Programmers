import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        } 
        
        int[] answer = new int[hs.size()];
        int cnt = 0;
        for (Integer item : hs) {
            answer[cnt++] = item;
        }
        Arrays.sort(answer);
        return answer;
    }
}