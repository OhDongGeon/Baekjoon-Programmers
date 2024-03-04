import java.io.*;

public class Main {

    static final int MOD = 10_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            dp[i][9] = 1;

            for (int j = 8; j >= 0; j--) {
                dp[i][j] += (dp[i - 1][j] + dp[i][j + 1]) % MOD;
            }
        }
        
        System.out.println(dp[N][0]);
    }
}
