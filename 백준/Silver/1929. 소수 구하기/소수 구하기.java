import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {

            int cnt = 0;
            
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt += 2;
                }
                if (j * j == i) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
