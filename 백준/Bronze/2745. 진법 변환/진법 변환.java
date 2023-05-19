import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        sc.close();
        int answer = 0;
        
        for (int i = 0; i < N.length(); i++) { 
            char digit = N.charAt(i);
            answer *= B;
            if ('A' <= digit && digit <= 'Z') {
                answer += digit - 'A' + 10;
            } else {
                answer += digit - '0';
            }
        }
        System.out.print(answer);
    }
}