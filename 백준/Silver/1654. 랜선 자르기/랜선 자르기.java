import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lan = new int[K];
        long lanMaxValue = 0;

        for (int i = 0; i < K; i++) {
            lan[i] = Integer.parseInt(br.readLine());
            if (lanMaxValue < lan[i]) {
                lanMaxValue = lan[i];
            }
        }

        long left = 1;
        long answer = 0;

        while (left <= lanMaxValue) {

            long count = 0;
            long mid = (left + lanMaxValue) / 2;

            for (int i = 0; i < K; i++) {
                count += lan[i] / mid;
            }

            if (count >= N) {
                left = mid + 1;
                answer = mid;
            } else {
                lanMaxValue = mid - 1;
            }
        }

        System.out.println(answer);
    }
}