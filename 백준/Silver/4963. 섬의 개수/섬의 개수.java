import java.io.*;
import java.util.*;

class Location {
    int x;
    int y;
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
    static int[][] rand;
    static boolean[][] visited;
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            
            if (w == 0 && h == 0) {
                break;
            }
            
            rand = new int[h][w];
            visited = new boolean[h][w];
            
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    rand[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && rand[i][j] == 1) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    
    static void bfs(int x, int y) {
        Queue<Location> qu = new LinkedList<>();
        qu.offer(new Location(x, y));
        
        while (!qu.isEmpty()) {
            Location location = qu.poll();
            
            for (int i = 0; i < 8; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];
                
                if (mx < 0 || mx >= rand.length || my < 0 || my >= rand[0].length || rand[mx][my] == 0 || visited[mx][my] ) {
                    continue;
                }
                
                visited[mx][my] = true;
                qu.offer(new Location(mx, my));
            }
        }
    }
}