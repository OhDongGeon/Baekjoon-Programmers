
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack();

        for(int item : arr) {
            if(stack.size() == 0 || stack.peek() != item) {
                stack.push(item);
            }
        }

        answer= stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}