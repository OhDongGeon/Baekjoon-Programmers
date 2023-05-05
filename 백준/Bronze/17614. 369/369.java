import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int cnt = 0;
            
        for (int i = 1; i <= N; i++) {
            int num = i;
            while (num != 0) {
                if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                    cnt++;
                }
                num = num / 10;
            }
        }
        System.out.print(cnt);
    }
}