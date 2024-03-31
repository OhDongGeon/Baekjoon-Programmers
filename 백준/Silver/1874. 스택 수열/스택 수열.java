import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            
            if (count < number) {
                for (int j = count + 1; j <= number; j++) {
                    stack.push(j);
                    sb.append("+\n");
                } 
                count = number;
            }
            
            if (stack.peek() == number) {
                stack.pop();
                sb.append("-\n");
            }
        }
        
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}