import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Stack<Character> stack = new Stack<>();
        int value = 1;
        int answer = 0;
            
        q : for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            switch (c) {
                case '(':
                    value *= 2;
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        answer = 0;
                        break q;
                    }
                    if (str.charAt(i - 1) == '(') {
                        answer += value;
                    }
                    value /= 2;
                    stack.pop();
                    break;
                    
                case '[':
                    value *= 3;
                    stack.push(c);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        answer = 0;
                        break q;
                    } 
                    if (str.charAt(i - 1) == '[') {
                        answer += value;
                    }
                    value /= 3;
                    stack.pop();
                    break;
            }
        }
        
        System.out.println(!stack.isEmpty() ? 0 : answer);
    }
}