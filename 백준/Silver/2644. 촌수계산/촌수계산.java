import java.io.*;
import java.util.*;

public class Main {
    
    static int n;
    static int[] visited;
    static int[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            arr[num1][num2] = arr[num2][num1] = 1;
        }
        
        visited = new int[n + 1];
        System.out.println(bfs(start, end));
    }
    
    static int bfs(int start, int end) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        
        while (!qu.isEmpty()) {
            int num = qu.poll();
            
            if (num == end) {
                return visited[num];
            }
            
            for (int i = 1; i <= n; i++) {
                if (visited[i] == 0 && arr[num][i] == 1) {
                    qu.add(i);
                    visited[i] = visited[num] + 1;
                }
            }
        }
        return -1;
    }
}