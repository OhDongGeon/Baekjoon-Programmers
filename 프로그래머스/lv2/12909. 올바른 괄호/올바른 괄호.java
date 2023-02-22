import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(') {
                stack.push(bracket);
            } else {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }
        
        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}