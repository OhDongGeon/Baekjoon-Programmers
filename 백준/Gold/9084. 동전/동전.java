import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {

            int coinCount = Integer.parseInt(br.readLine());
            int[] coins = new int[coinCount];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < coins.length; j++) {
                coins[j] = Integer.parseInt(st.nextToken());
            }
            
            int money = Integer.parseInt(br.readLine());

            int[] dp = new int[money + 1];
            dp[0] = 1;

            for (int coin : coins) {
                for (int j = coin; j < dp.length; j++) {
                    dp[j] += dp[j - coin];
                }
            }
            System.out.println(dp[money]);
        }
    }
}
