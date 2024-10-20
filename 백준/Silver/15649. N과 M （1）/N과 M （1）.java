import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        
        dfs(0);
        
        System.out.println(sb);
    }
    
    static void dfs(int cnt) {
        if (cnt == M) {
            for (Integer item : arr) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i + 1;
                dfs(cnt + 1);
                visited[i] = false;   
            }
        }
    }
}