import java.io.*;

public class Main {
    
    static int N;
    static int[] arr, answer;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        answer = new int[N];
        visited = new boolean[N];
        dfs(0);
        
        System.out.println(sb);
    }
    
    static void dfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}