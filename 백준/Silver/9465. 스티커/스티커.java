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

            int[][] dp = new int[2][n + 1];

            dp[0][1] = Integer.parseInt(top.nextToken());
            dp[1][1] = Integer.parseInt(bottom.nextToken());

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + Integer.parseInt(top.nextToken());
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + Integer.parseInt(bottom.nextToken());
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}