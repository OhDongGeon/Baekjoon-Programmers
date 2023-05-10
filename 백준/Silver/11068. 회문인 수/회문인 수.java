import java.util.*;

public class Main {
    public static boolean change (int num, int change) {
        int[] digit = new int[20];
        int len = 0;
        
        while (num > 0) {
            digit[len++] = num % change;
            num /= change;
        }
        
        for (int i = 0; i < len / 2; i++) {
            if (digit[i] != digit[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            boolean chk = false;
            int num = sc.nextInt();
            
            for (int j = 2; j <= 64; j++) {
                chk = change(num, j);
                if (chk) {
                    break;
                }
            } 
            System.out.println(chk ? 1 : 0);
        }
        sc.close();
    }
}