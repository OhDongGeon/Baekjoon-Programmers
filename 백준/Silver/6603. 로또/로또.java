import java.io.*;
import java.util.*;

public class Main {
    
    static int[] arr, answer;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            
            if (k == 0) {
                break;
            }
            
            arr = new int[k];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            answer = new int[6];
            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    
    static void dfs(int cnt, int start) {
        if (cnt == 6) {
            for (int item : answer) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = start; i < arr.length; i++) {
            answer[cnt] = arr[i];
            dfs(cnt + 1, i + 1);
        }
    }
}