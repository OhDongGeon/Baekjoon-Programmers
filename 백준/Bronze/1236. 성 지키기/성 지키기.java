import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] arr = new String[N];
        int count = 0;
        
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
			if(!arr[i].contains("X")) {
				count++;
			}
		}
        
		int answer = count;
		count = 0;
        
		for(int i = 0; i < M; i++) {
            int counts = 0;
            
			for(int j = 0; j < N; j++) {
                if(arr[j].charAt(i) == '.') {
                    counts++;
                }
			}
			if(counts == N) {
               count++; 
            }
		}
		answer = Math.max(answer, count);
		System.out.println(answer);
    }
}