import java.io.*;
import java.util.*;

public class Main {
    
    static int N, find;
    static int[] dx = {1, 0, -1, 0}; // ↓ → ↑ ← 
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        find = Integer.parseInt(br.readLine());
   
        arr = new int[N][N];
        
        String location = make();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(location);
        
        System.out.println(sb);
    }
    
    static String make() {
        int cnt = N * N;
        int x = 0, y = 0, idx = 0;
        String location = "";
        while (cnt != 0) {
            arr[x][y] = cnt--;
            
            if (arr[x][y] == find) {
                location = String.format("%d %d", x + 1, y + 1);
            }
            
            idx = check(x + dx[idx], y + dy[idx], idx);
            x += dx[idx];
            y += dy[idx];
        }
        
        return location;
    }
    
    static int check(int x, int y, int idx) {
        if (x < 0 || x >= N || y < 0 || y >= N || arr[x][y] != 0) {
            idx = (idx + 1) % 4;
        }
        return idx;
    }
}