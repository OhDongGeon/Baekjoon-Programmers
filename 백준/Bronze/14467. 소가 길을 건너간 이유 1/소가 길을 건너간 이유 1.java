import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] cows = new int[11];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken()) + 1;

            if (cows[number] != 0) {
                if (cows[number] != location) {
                    answer++;
                }
            }
            cows[number] = location;
        }
        System.out.println(answer);
    }
}
