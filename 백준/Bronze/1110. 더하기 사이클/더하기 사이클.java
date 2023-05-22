import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nCopy = N;
        int cnt = 0;

        while (true) {
            cnt++;
            nCopy = ((nCopy % 10 + nCopy / 10) % 10) + (nCopy % 10 * 10);

            if (N == nCopy) {
                break;
            }
        }
        System.out.println(cnt);
    }
}