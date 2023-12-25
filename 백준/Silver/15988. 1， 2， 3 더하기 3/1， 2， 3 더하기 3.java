import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> arr = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        
        int maxValue = Collections.max(arr);
        long[] dp = new long[maxValue];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1_000_000_009;
        }
        
        for (Integer num : arr) {
           System.out.println(dp[num - 1]); 
        } 
    }
}