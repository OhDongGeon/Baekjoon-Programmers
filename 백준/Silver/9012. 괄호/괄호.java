import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String chkVPS = br.readLine();
            boolean check = true;
            
            Stack<String> stack = new Stack<>();
            
            for (int j = 0; j < chkVPS.length(); j++) {
                if (chkVPS.charAt(j) == '(') {
                    stack.push("(");
                } else if (stack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    stack.pop();
                }
            }
            System.out.println(check && stack.isEmpty() ? "YES" :  "NO");
        }
    }
}