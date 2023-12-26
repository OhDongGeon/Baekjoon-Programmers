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
    
    static int n, m;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] miro;
    static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        miro = new int[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < miro.length; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++) {
                miro[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(miro[n - 1][m - 1]);
    }
    
    static void bfs(int iIdx, int jIdx) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(iIdx, jIdx));
        
        while(!queue.isEmpty()) {
            Location location = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int x = location.x + dx[i];
                int y = location.y + dy[i];
                
                if (x < 0 || x >= n || y < 0 || y >= m || miro[x][y] == 0 || visited[x][y]) {
                    continue;
                }
                
                queue.offer(new Location(x, y));
                visited[x][y] = true;
                miro[x][y] = miro[location.x][location.y] + 1;
            }
        }
    }
}