import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() && arr[i] == 2) {
                stack.push(arr[i]);
            } else if (!stack.isEmpty()) {
                stack.push(arr[i]);
            }
        }
        
        if (stack.isEmpty()) {
            stack.push(-1);
        } else {
            while (stack.peek() != 2) {
                stack.pop();
            }
        }
        return stack;
    }
}