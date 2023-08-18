import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = 0;
        
        while (true) {
            if (N % 5 == 0) {
                System.out.print(N / 5 + answer);
                return;
            }
            
            if (N < 0) {
                System.out.print(-1);
                return;
            }
            
            N -= 3;
            answer++;
        } 
    }
}