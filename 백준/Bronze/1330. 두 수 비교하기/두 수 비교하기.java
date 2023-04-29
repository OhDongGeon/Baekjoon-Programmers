import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();
        if (first > second) {
            System.out.print(">");
        } else if (first < second) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}