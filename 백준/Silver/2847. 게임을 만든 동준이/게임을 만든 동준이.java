import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (i != 0 && score[i - 1] >= score[i]) {
                answer += (score[i - 1] - score[i] + 1);
                score[i - 1] = score[i] - 1;
            }
        }
        System.out.println(answer);
    }
}