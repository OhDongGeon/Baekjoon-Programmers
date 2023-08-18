import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];
        
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }
        sc.close();
        
        int answer = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] > K) {
                continue;
            }
            
            answer += K / coins[i];
            K %= coins[i];
            
            if (K == 0) {
                break;
            }
        }
        System.out.print(answer);
    }
}