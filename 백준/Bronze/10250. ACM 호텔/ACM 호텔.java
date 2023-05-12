import java.util.*;

public class Main {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int h = sc.nextInt(); // 층수
            int w = sc.nextInt(); // 방
            int n = sc.nextInt(); // 번째

            int locationW = ((n - 1) / h) + 1;
            int locationH = ((n - 1) % h) + 1;
            System.out.println(locationH + String.format("%02d", locationW));
        }
    }
}