import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = dp[i] = sc.nextInt();
        }
        sc.close();
        
        int answer = dp[0];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[j] + a[i], dp[i]);
                    answer = Math.max(answer, dp[i]);
                }
            }
        }
        
        System.out.print(answer);
    }
}