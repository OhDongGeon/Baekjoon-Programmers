import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M - 1; i++) {
            st = new StringTokenizer(br.readLine());
            first = Math.min(first, Integer.parseInt(st.nextToken()));
            second = Math.min(second, Integer.parseInt(st.nextToken()));
        }

        int answer;
        int item = second * 6;
        if (item < first) {
            answer = N * second;
        } else {
            answer = (N / 6) * first;
            answer += Math.min((N % 6) * second , first);
        }

        System.out.println(answer);
    }
}