import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int[] map;
    static int[] answer;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] agrs) throws IOException {
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
        
        visited = new boolean[N];
        answer = new int[M];
        dfs(0, 0);
        
        System.out.println(sb);
    }
    
    static void dfs(int start, int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[cnt] = map[i];
                dfs(i, cnt + 1);
                visited[i] = false;
            }
        }
    }
}