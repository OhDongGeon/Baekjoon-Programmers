import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            // 확인로직
            answer += check(arr);
            
            char first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1]; 
            }
            arr[arr.length - 1] = first;
        }
        
        return answer;
    }
    
    public int check (char[] arr) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (arr[i] == ')' && stack.peek() == '(' || 
                       arr[i] == '}' && stack.peek() == '{' || 
                       arr[i] == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}

















