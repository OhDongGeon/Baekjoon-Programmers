import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] rank = new int[N][2];
            int cnt = 1;
            
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                rank[j][0] = Integer.parseInt(st.nextToken());
                rank[j][1] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(rank, (o1, o2) -> {
                return o1[0] - o2[0];
            });
            
            for (int j = 1; j < N; j++) {
               if (rank[j - 1][1] > rank[j][1]) {
                   cnt++;
               } else {
                   rank[j][1] = rank[j - 1][1];
               }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}