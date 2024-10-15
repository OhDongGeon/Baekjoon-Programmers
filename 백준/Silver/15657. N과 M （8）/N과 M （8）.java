import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] map, num;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(map);
        
        num = new int[M];
        dfs(0, 0);
        System.out.println(sb);
    }
    
    static void dfs(int start, int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        
        for (int i = start; i < N; i++) {
            num[cnt] = map[i];
            dfs(i, cnt + 1);
        }
    }
}