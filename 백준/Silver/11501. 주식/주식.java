import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] days = new int[N];
            String[] staple = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                days[j] =  Integer.parseInt(staple[j]);
            }

            int sell = days[N - 1];
            long answer = 0;
            for (int j = N - 2; j >= 0; j--) {
                if (sell >= days[j]) {
                    answer += sell - days[j];
                } else {
                    sell = days[j];
                }
            }
            System.out.println(answer);
        }
    }
}