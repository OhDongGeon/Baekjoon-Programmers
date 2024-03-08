import java.io.*;
import java.util.*;


class Location {
    int x;
    int y;
    int count;
    int wall;
    
    public Location(int x, int y, int count, int wall) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.wall = wall;
    }
}

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String size = br.readLine();

        int N = Integer.parseInt(size.split(" ")[0]);
        int M = Integer.parseInt(size.split(" ")[1]);

        map = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs(N, M));
    }

    static int bfs(int N, int M) {

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(0, 0, 1, 0));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            if (location.x == N - 1 && location.y == M - 1) {
                return location.count;
            }

            for (int i = 0; i < 4; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];

                if (mx < 0 || mx >= N || my < 0 || my >= M) {
                    continue;
                }

                if (map[mx][my] == 1) {
                    if (location.wall == 0) {
                        queue.offer(new Location(mx, my, location.count + 1, 1));
                        visited[mx][my][1] = true;
                    }
                } else {
                    if (!visited[mx][my][location.wall]) {
                        queue.offer(new Location(mx, my, location.count + 1, location.wall));
                        visited[mx][my][location.wall] = true;
                    }
                }
            }
        }
        return -1;
    }
}