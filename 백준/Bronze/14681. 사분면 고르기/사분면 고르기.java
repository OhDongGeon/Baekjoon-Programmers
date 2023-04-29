import java.util.*;

public class Main {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();
        
        if (first >= 0 && second > 0) {
            System.out.print(1);
        } else if(first <= 0 && second > 0) {
            System.out.print(2);
        } else if(first <= 0 && second < 0) {
            System.out.print(3);
        } else {
            System.out.print(4);
        }
    }
}