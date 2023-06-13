import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length= num_list.length;
        int[] answer = Arrays.copyOf(num_list, length + 1);
        
        if (num_list[length - 1] > num_list[length - 2]) {
            answer[length] = num_list[length - 1] - num_list[length - 2];
         } else {
            answer[length] = num_list[length - 1] * 2;
        }
        
        return answer;
    }
}