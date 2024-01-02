import java.io.*;
import java.util.*;

class Location {
    int height;
    int row;
    int col;
    int day;
    
    public Location(int height, int row, int col, int day) {
        this.height = height;
        this.col = col;
        this.row = row;
        this.day = day;
    }
}

public class Main {
    
    static int M, N, H, answer;
    static int[] dRow = {1, 0, -1, 0, 0, 0};
    static int[] dCol = {0, 1, 0, -1, 0, 0};
    static int[] dHeight = {0, 0, 0, 0, 1, -1};
    static int[][][] arr;
    static Queue<Location> queue = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        arr = new int[H][N][M];
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    
                    if (arr[i][j][k] == 1) {
                        queue.offer(new Location(i, j, k, 0));
                    }
                }
            }
        }
        bfs();
    }
    
    static void bfs() {
        
        int day = 0;
        while (!queue.isEmpty()) {
            Location location = queue.poll();
            day = location.day;
            
            for (int i = 0; i < 6; i++) {
                int height = location.height + dHeight[i];
                int row = location.row + dRow[i];
                int col = location.col + dCol[i];
                
                if (height < 0 || height >= H || row < 0 || row >= N || col < 0 || col >= M ||
                   arr[height][row][col] == -1 || arr[height][row][col] == 1) {
                    continue;
                }
                
                arr[height][row][col] = 1;
                queue.offer(new Location(height, row, col, day + 1));
            }
        }
        
        if (checkBox()) {
            System.out.println(-1);
        } else {
            System.out.println(day);
        }
    }
    
    static boolean checkBox() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[i][j][k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}