import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] cnt = new int[N + 1];
  
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            X += Integer.parseInt(st.nextToken());
            if (K > X) {
                cnt[i] = cnt[i - 1] + 1;
            } else {
                cnt[i] = cnt[i - 1];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(cnt[end - 1] - cnt[start - 1]).append("\n");
        }
        System.out.println(sb);
    }
}