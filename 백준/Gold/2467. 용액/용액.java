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

        Arrays.sort(solution);

        int left = 0;
        int right = N - 1;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (left < right) {

            int leftValue = solution[left];
            int rightValue = solution[right];

            if (min > Math.abs(leftValue + Math.abs(rightValue))) {
                answer[0] = leftValue;
                answer[1] = rightValue;
                min = Math.abs(leftValue + rightValue);
            }

            if (Math.abs(leftValue) < Math.abs(rightValue)) {
                right--;
            } else {
                left++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}