import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        if (m >= 45) {
            System.out.print(h + " " + (m - 45));
        } else {
            h--;
            if (h < 0) {
                h = 23;
            }
            System.out.print(h + " " + (60 - (45 - m)));
        }
    }
}