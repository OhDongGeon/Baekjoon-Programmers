import java.io.*;
import java.util.*;

class Location {
    int x;
    int y;
    int count;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Location(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}

public class Main {

    static int N;
    static int answer = Integer.MAX_VALUE;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    count++;
                    bfs(i, j, count);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] > 1) {
                    visited = new boolean[N][N];
                    bfs(i, j);
                }
            }
        }

        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }

    static void bfs (int x, int y, int count) {

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));
        visited[x][y] = true;
        map[x][y] = count;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];

                if (mx < 0 || mx >= N || my < 0 || my >= N || map[mx][my] == 0 || visited[mx][my]) {
                    continue;
                }

                queue.offer(new Location(mx, my));
                visited[mx][my] = true;
                map[mx][my] = count;
            }
        }
    }

    static void bfs (int x, int y) {

        int cur = map[x][y];
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y, 0));

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];

                if (mx < 0 || mx >= N || my < 0 || my >= N || map[mx][my] == cur || visited[mx][my]) {
                    continue;
                }

                if (map[mx][my] == 0) {
                    queue.offer(new Location(mx, my, location.count + 1));
                    visited[mx][my] = true;
                } else {
                    answer = Math.min(answer, location.count);
                }
            }
        }
    }
}