import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] number = new int[A];
		
		for (int i = 0; i < A; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < A; i++) {
		
			while(!stack.isEmpty()) {
				if (number[stack.peek()] < number[i]) {
					number[stack.peek()] = number[i];
					stack.pop();
				} else {
					break;
				}
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			number[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A; i++) {
			sb.append(number[i]).append(" ");
		}
		System.out.println(sb);
	}
}