import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] solution = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            solution[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N - 1;
        int value = Integer.MAX_VALUE;

        while (left < right) {
            int sum = solution[left] + solution[right];

            if (Math.abs(sum) <= Math.abs(value)) {
                value = sum;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(value);
    }
}