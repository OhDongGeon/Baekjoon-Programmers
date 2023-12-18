import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] dp = new int[10];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
       
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            System.out.println(dp[sc.nextInt() - 1]);
        }
        sc.close();
    }
}