import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        sc.close();
        int[] btn = {300, 60, 10};
        int[] answer = new int[3];
        
        if (second % 10 != 0) {
            System.out.print(-1);
            return;
        }
        
        for (int i = 0; i < btn.length; i++) {
            if (second < btn[i]) {
                continue;
            }
            answer[i] += second / btn[i];
            second %= btn[i];
        }
        System.out.print(answer[0] + " " + answer[1] + " " + answer[2]);
    }
}