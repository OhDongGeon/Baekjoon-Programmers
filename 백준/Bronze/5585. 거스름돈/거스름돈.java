import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int pay = 1000 - sc.nextInt();
        sc.close();
        int[] jan = {500, 100, 50, 10, 5, 1}; 
        int answer = 0;
        
        for (int i = 0; i < jan.length; i++) {
            answer += pay / jan[i];
            pay = pay % jan[i];
            
            if (pay == 0) {
                break;
            }
        }
        System.out.print(answer);
    }
} 