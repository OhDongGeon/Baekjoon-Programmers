import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList();
        
        for(int i = 0; i < score.length; i++) {
            arr.add(score[i][0] + score[i][1]);
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}