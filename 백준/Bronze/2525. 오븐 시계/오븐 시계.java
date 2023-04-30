import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        
        int minute = (60 * A) + B + C;
        System.out.print(((minute / 60) % 24) + " " + (minute % 60));
    }
}