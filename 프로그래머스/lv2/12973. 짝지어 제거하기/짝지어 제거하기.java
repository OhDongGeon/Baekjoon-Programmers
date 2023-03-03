import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            
            if(stack.isEmpty() || stack.peek() != alphabet) {
                stack.push(alphabet);
            } else if(stack.peek() == alphabet) {
                stack.pop();
            }
        }
        
        if(stack.size() == 0) {
            answer = 1;   
        }
        
        return answer;
    }
}