import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];
        long right = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (right < tree[i]) {
                right = tree[i];
            }
        }

        long answer = 0;
        long left = 0;
        while (left <= right) {

            long mid = (left + right) / 2;
            long count = 0;

            for (int i = 0; i < N; i++) {
                if (mid < tree[i]) {
                    count += (tree[i] - mid);
                }
            }
            if (count >= M) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}