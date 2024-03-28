import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String function = st.nextToken();
            
            if (function.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (function.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (function.equals("size")) {
                System.out.println(stack.size());
            } else if (function.equals("pop") || function.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else if (function.equals("pop")) {
                    System.out.println(stack.pop());
                } else if (function.equals("top")) {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}