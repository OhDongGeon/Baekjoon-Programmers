import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long M = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        StringBuilder sb = new StringBuilder();

        if (M > N) {
            sb.append((N - 1) * 2 + 1).append("\n");
        } else {
            sb.append((M - 1) * 2).append("\n");
        }

        if (M > N) {
            if (N % 2 == 0) {
                sb.append(N / 2 + 1).append(" ").append(N / 2);
            } else {
                sb.append(N / 2 + 1 + (M - N)).append(" ").append(N / 2 + 1);
            }
        } else if (M < N) {
            if (M % 2 == 0) {
                sb.append(M / 2 + 1).append(" ").append(M / 2);
            } else {
                sb.append(M / 2 + 1).append(" ").append(M / 2 + 1 + (N - M));
            }
        } else {
            if(M % 2 == 0) {
                sb.append(M / 2 + 1).append(" ").append(N / 2);
            }else {
                sb.append(M / 2 + 1).append(" ").append(N / 2 + 1);
            }
        }
        System.out.println(sb);
    }
}