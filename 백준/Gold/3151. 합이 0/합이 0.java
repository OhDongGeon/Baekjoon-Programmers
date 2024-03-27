import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] code = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            code[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(code);

        long answer = 0;
        for (int i = 0; i < N; i++) {
            if (code[i] > 0) {
                break;
            }

            int left = i + 1;
            int right = N - 1;

            while (left < right) {
                int start = 1;
                int end = 1;
                int value = code[i] + code[left] + code[right];

                if (value == 0) {
                    if (code[left] == code[right]) {
                        answer += combination(right - left + 1);
                        break;
                    }

                    while (left + 1 < right && code[left] == code[left + 1]) {
                        left++;
                        start++;
                    }

                    while (left < right - 1 && code[right] == code[right - 1]) {
                        right--;
                        end++;
                    }

                    answer += (long) start * end;
                }
                if (value > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(answer);
    }

    static int combination (int n) {
        return n * (n - 1) / 2;
    }
}
