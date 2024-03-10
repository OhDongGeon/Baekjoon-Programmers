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

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] iceberg;
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        iceberg = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                iceberg[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while (true) {
            
            int icebergCount = 0;
            visited = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visited[i][j] && iceberg[i][j] > 0) {
                        icebergCount++;
                        bfs(i, j);
                    }

                    if (icebergCount > 1) {
                        System.out.println(year);
                        return;
                    }
                }
            }
            if (icebergCount == 0) {
                System.out.println(0);
                return;
            }
            year++;
        }
    }

    static void bfs(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();
            int seeCount = 0;

            for (int i = 0; i < 4; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];

                if (mx < 0 || mx >= iceberg.length || my < 0 || my >= iceberg[0].length || visited[mx][my]) {
                    continue;
                }
                if (iceberg[mx][my] <= 0) {
                    seeCount++;
                    continue;
                }

                queue.offer(new Location(mx, my));
                visited[mx][my] = true;
            }
            iceberg[location.x][location.y] -= seeCount;
        }
    }
}