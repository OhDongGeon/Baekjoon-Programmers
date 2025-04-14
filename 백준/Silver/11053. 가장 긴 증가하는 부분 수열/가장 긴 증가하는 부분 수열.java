import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arr = new int[A + 1];
        int[] dp = new int[A + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;

            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }    
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}