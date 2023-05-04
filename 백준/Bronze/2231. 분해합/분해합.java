import java.util.*;

public class Main {
    public static int solution(int N) {
        int answer = 0;
        
        for (int i = 1; i <= N; i++) {
            int num = i;
            int sum = 0;
            
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            
            if (N == i + sum) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        System.out.print(solution(N));
    }
}