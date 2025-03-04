import java.io.*;
import java.util.*;

public class Main {
    
    static int N, S, answer;
    static int[] number;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        number = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0, 0);
      
        System.out.println(S == 0 ? --answer : answer);
    }
    
    static void dfs(int cnt, int sum) {
        if (cnt == N) {
            if (sum == S) {
                answer++;
            }
            return;
        }
        
        dfs(cnt + 1, sum + number[cnt]);
        dfs(cnt + 1, sum);
    }
}