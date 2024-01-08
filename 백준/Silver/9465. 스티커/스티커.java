import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer top = new StringTokenizer(br.readLine());
            StringTokenizer bottom = new StringTokenizer(br.readLine());

            long[][] dp = new long[2][n + 1];
            
            dp[0][1] = Long.parseLong(top.nextToken());
            dp[1][1] = Long.parseLong(bottom.nextToken());

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + Long.parseLong(top.nextToken());
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + Long.parseLong(bottom.nextToken());
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}