import java.util.*;

public class Main {
    public static void main(String[] arg) {
        int[] eureka = new int[45];
        int[] chk = new int[1001];
        
        for (int i = 1; i <= eureka.length; i++) {
            eureka[i - 1] = i * (i + 1) / 2;
        }
        
        for (int i = 0; i < eureka.length; i++) {
            for (int j = i; j < eureka.length; j++) {
                for (int k = j; k < eureka.length; k++) {
                    int sum = eureka[i] + eureka[j] + eureka[k];
                    if (sum > 1000) {
                        break;
                    }
                    chk[sum] = 1;
                }
            }
        }
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            System.out.println(chk[K]);
        }
        sc.close();
    }
}