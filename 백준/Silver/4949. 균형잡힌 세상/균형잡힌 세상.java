import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String str = br.readLine();
            
            if (str.equals(".")) {
                break;
            }
            
            char[] sentence = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            
            for (Character item : sentence) {
                if (item == '(' || item == '[') {
                    stack.push(item);
                } else if (item == ')' || item == ']') {
                    if (!stack.isEmpty() && (item == ')' && stack.peek() == '(' || 
                                             item == ']' && stack.peek() == '[')) {
                        stack.pop();
                    } else {
                        stack.push(item);
                    }
                }
            }
            
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}