import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);

        int x = Integer.parseInt(br.readLine());
        int left = 0;
        int right = n - 1;
        int answer = 0;

        while (left < right) {

            int sum = number[left] + number[right];

            if (sum == x) {
                answer++;
                if (number[left] == number[left + 1]) {
                    left++;
                } else {
                    right--;
                }
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(answer);
    }
}