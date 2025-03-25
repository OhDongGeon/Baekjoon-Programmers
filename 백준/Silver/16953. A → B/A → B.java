import java.io.*;
import java.util.*;

public class Main {
    
    static int B, answer = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Long.parseLong(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        dfs(1, A);
        
        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }
    
    static void dfs(int cnt, long start) {
        
        if (start >= B) {
            if (start == B) {
                answer = Math.min(answer, cnt);
            }
            return;
        }
        
        dfs(cnt + 1, start * 2);
        dfs(cnt + 1, start * 10 + 1);
    }
}