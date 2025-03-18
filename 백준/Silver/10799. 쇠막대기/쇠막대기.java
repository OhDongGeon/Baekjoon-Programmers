import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        
        Deque<Character> dq = new ArrayDeque<>();
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                dq.add('(');
                continue;
            }
            
            dq.poll();
            if (arr[i - 1] == ')') {
                answer++;
            } else {
                answer += dq.size();
            }
        }
        System.out.println(answer);
    }
}