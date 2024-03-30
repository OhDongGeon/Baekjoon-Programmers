import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        int answer = 0;
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());
            
            if (!stack.isEmpty() && number == 0) {
                answer -= stack.pop();
            } else if (number != 0) {
                stack.push(number);
                answer += number;
            }
        }
        System.out.println(answer);
    }
}