import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int length = arr.length;
        int[][] dp = new int[41][3];
        dp[1][1] = 1;
        
        int pre = (arr[0] - '0') * 10;
        for (int i = 2; i <= length; i++) {
            int num = (arr[i - 1] - '0');
            if (num == 0) {
                if (pre + num <= 34) {
                    dp[i][2] = dp[i - 1][1];
                }
                continue;
            }
            if (pre + num <= 34) {
                dp[i][1] = dp[i - 1][1] + dp[i - 1][2];
                dp[i][2] = dp[i - 1][1];
            } else {
                dp[i][1] = dp[i - 1][1] + dp[i - 1][2];
            }
            pre = num * 10;
        }
        System.out.println(dp[length][1] + dp[length][2]);
    }
}