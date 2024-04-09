import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int j = 1; j * j <= number; j++) {
                if (number % j == 0) {
                    count += 2;
                }
                if (j * j == number) {
                    count++;
                }
            }

            if (count == 2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}