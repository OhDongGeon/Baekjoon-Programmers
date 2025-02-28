import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] cost = new int[n + 1];
        int[] dp = new int[k + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            cost[i] = Integer.parseInt(br.readLine());
            
            for (int j = cost[i]; j <= k; j++) {
                dp[j] += dp[j - cost[i]];
            }
        }
        
        System.out.println(dp[k]);
    }
}