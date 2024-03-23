import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] city = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int right = 0;
        for (int i = 0; i < N; i++) {
            city[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, city[i]);
        }

        int left = 0;
        int answer = 0;

        while (left <= right) {

            int mid = (left + right) / 2;
            int money = 0;

            for (int i = 0; i < N; i++) {

                if (mid >= city[i]) {
                    money += city[i];
                } else {
                    money += mid;
                }
            }

            if (money <= M) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}