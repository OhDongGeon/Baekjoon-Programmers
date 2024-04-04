import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String postfix = br.readLine();
		char[] arr = postfix.toCharArray();
		
		Map<Character, Double> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put((char)('A' + i), Double.parseDouble(br.readLine()));
		}
		
		Stack<Double> stack = new Stack<>();
		for(int i = 0; i < arr.length; i++) {
			
			if (!map.containsKey(arr[i])) {
				double num1 = stack.pop();
				double num2 = stack.pop();
			
				switch (arr[i]) {
					case '+' :
						stack.push(num2 + num1);
					break;
					case '*' :
						stack.push(num2 * num1);
					break;
					case '-' :
						stack.push(num2 - num1);
					break;
					case '/' :
						stack.push(num2 / num1);
					break;
				}
			} else {
				stack.push(map.get(arr[i]));
			}
		}
		System.out.printf("%.2f",stack.peek());
	}
}