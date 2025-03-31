import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static int[] arr, num;
    static boolean[] visited;
    static StringBuilder sb;
    static LinkedHashSet<String> lhs = new LinkedHashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visited = new boolean[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        num = new int[M];
        
        dfs(0, 0);
        
        sb = new StringBuilder();
        for (String item : lhs) {
            sb.append(item).append("\n");
        }
        System.out.println(sb);
    }
    
    static void dfs(int depth, int start) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(num[i]).append(" ");
            }
            lhs.add(sb.toString());
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                num[depth] = arr[i];
                dfs(depth + 1, i);
                visited[i] = false;
            }
        }
    }
}