import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] =  Integer.parseInt(br.readLine());
        }

        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }

        int answer = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (hs.contains(numbers[j] - numbers[i])) {
                    answer = Math.max(answer, numbers[j]);
                }
            }
        }

        System.out.println(answer);
    }
}