import java.io.*;
import java.util.*;

public class Main {
    static int answer = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new boolean[M][N];
        
        draw(M, N);

        System.out.println(answer);
    }
    
    static void draw(int M, int N) {
        int cnt = M * N;
        int x = 0, y = 0, idx = 0;
        while (cnt != 1) {
            arr[x][y] = true;
            cnt--;
            
            idx = chk(M, N, x + dx[idx], y + dy[idx], idx);
            
            x += dx[idx];
            y += dy[idx];
    }
  }

    static int chk(int M, int N, int x, int y, int idx) {
        if (x < 0 || x >= M || y < 0 || y >= N || arr[x][y]) {
            idx = (idx + 1) % 4;
            answer++;
        }
        return idx;
    }
}