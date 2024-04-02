import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Long> stack = new Stack<>();
		long answer = 0;
		
		for (int i = 0; i < N; i++) {
			
			long building = Long.parseLong(br.readLine());
			
			while (!stack.isEmpty()) {
				if (stack.peek() <= building) {
					stack.pop();
				} else {
					break;
				}
			}
			
			answer += stack.size();
			stack.push(building);
		}
		System.out.println(answer);
	}
}