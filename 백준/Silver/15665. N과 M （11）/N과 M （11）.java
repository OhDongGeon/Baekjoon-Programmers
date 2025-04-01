import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static int[] arr, answer;
    static StringBuilder sb;
    static LinkedHashSet<String> lhs = new LinkedHashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        answer = new int[M];
        dfs(0);
        
        sb = new StringBuilder();
        for (String item : lhs) {
            sb.append(item);
        }
        
        System.out.println(sb);
    }
    
    static void dfs(int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            lhs.add(sb.toString());
            return;
        }
        
        for (int i = 0; i < N; i++) {
            answer[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}