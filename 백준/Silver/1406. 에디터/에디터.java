import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String first[] = br.readLine().split("");
        int second = Integer.parseInt(br.readLine());
        
        Stack<String> stack1 = new Stack<>();
        for (String item : first) {
            stack1.push(item);
        }
    
        Stack<String> stack2 = new Stack<>();
        
        StringTokenizer st;
        for (int i = 0; i < second; i++) {
            st = new StringTokenizer(br.readLine());
            String edit = st.nextToken();

            if(edit.equals("L")) {
				if(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}else if(edit.equals("D")) {
				if(!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			}else if(edit.equals("B")) {
				if(!stack1.isEmpty()) {
					stack1.pop();
				}
			}else {
				stack1.push(st.nextToken());
			}
        }
        
        while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
        
        StringBuilder sb = new StringBuilder();
        for (String item : stack1) {
            sb.append(item);
        }
        System.out.println(sb);
    }
}