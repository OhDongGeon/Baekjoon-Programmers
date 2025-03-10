import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static boolean[] visited;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int front = Integer.parseInt(st.nextToken());
            int back = Integer.parseInt(st.nextToken());
            arr[front][back] = arr[back][front] = 1;
        }
        
        visited = new boolean[N + 1];
        dfs(V);
        
        sb.append("\n");
        
        visited = new boolean[N + 1];
        bfs(V);
        
        System.out.println(sb);
    }
    
    static void dfs(int V) {
        
        sb.append(V).append(" ");
        visited[V] = true;
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && arr[V][i] == 1) {
                dfs(i);
            }
        }
    }
    
    static void bfs(int V) {
        
        queue.add(V);
        visited[V] = true;
        
        while (!queue.isEmpty()) {
            
            V = queue.poll();
            sb.append(V).append(" ");
            
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && arr[V][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}