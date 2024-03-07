import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int minusCount = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());

            if (numbers[i] < 0) {
                minusCount++;
            }
        }

        Arrays.sort(numbers);

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] > 0) {
                break;
            } else if (i == N - 1 || numbers[i + 1] > 0) {
                answer += numbers[i];
                continue;
            }

            answer += numbers[i] * numbers[i + 1];
            i++;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (numbers[i] < 1) {
                break;
            } else if (i == 0|| numbers[i] < 2 || numbers[i - 1] < 2) {
                answer += numbers[i];
                continue;
            }

            answer += numbers[i] * numbers[i - 1];
            i--;
        }

        System.out.println(answer);
    }
}