import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Set<String> ts = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String recode = st.nextToken();
			
			if (recode.equals("leave")) {
				ts.remove(name);
			} else {
				ts.add(name);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		ts.stream().forEach(name -> sb.append(name).append("\n"));
		System.out.println(sb);
	}
}