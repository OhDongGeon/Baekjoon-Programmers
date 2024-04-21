import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] arr;
    static int answer = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {

            String chess = br.readLine();

            for (int j = 0; j < M; j++) {
                if (chess.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                check(i, j);
            }
        }
        System.out.println(answer);
    }

    static void check (int x, int y) {

        int count = 0;
        boolean color = arr[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != color) {
                    count++;
                }
                color = !color;
            }
            color = !color;
        }
        count = Math.min(count, 64 - count);
        answer = Math.min(answer, count);
    }
}