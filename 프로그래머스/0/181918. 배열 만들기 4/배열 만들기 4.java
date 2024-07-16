import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        
        while (i != arr.length) {
            
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() < arr[i]) {
                    stack.push(arr[i]);
                } else {
                    stack.pop();
                    continue;
                }
            }
            i++;
        }
        
        return stack;
    }
}