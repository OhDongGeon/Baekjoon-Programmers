import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int answer = 0;
        
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
                if (K == 0) {
                    answer = i;
                    break;
                }
            } 
        }
        System.out.print(answer);
    }
}