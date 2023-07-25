import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> num = new ArrayList<>();
        
        for (int item : arr) {
            num.add(item);
        } 
        
        for (Integer item : delete_list) {
            if (num.contains(item)) {
                num.remove(item);
            }
        }
        
        int[] answer = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            answer[i] = num.get(i);
        }

        return answer;
    }
}