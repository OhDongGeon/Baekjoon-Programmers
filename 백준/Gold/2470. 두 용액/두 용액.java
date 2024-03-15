import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solutions);

        int left = 0;
        int right = N - 1;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (left < right) {
            int sum = solutions[left] + solutions[right];

            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                answer[0] = solutions[left];
                answer[1] = solutions[right];

                if (sum == 0) {
                    break;
                }
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}