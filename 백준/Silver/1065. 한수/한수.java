import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                answer++;
                continue;
            }
            int one = i % 10;
            int ten = i / 10 % 10;
            int hunderd = i / 100;
            
            if (one - ten == ten - hunderd) {
                answer++;
            }
        }
        
        System.out.print(answer);
    }
}