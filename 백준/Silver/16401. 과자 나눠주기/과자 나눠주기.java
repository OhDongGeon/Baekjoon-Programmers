import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] cookie = new int[N];

        int right = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cookie[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, cookie[i]);
        }

        int left = 1;
        int answer = 0;

        while (left <= right) {

            int count = 0;
            int mid = (left + right) / 2;

            for (int i = 0; i < N; i++) {
                count += cookie[i] / mid;
            }

            if (M <= count) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}