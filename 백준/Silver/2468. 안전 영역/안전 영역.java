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

    static int N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] city;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        city = new int[N][N];

        int maxHeight = 0;
        for (int i = 0; i < N; i++) {
            String[] height = br.readLine().split(" ");

            for (int j = 0; j < height.length; j++) {
                city[i][j] = Integer.parseInt(height[j]);
                maxHeight = Math.max(maxHeight, city[i][j]);
            }
        }

        int answer = 0;
        for (int i = 0; i <= maxHeight; i++) {
            visited = new boolean[N][N];
            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (!visited[j][k] && city[j][k] > i) {
                        count += bfs(j, k, i);
                    }
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }


    public static int bfs(int x, int y, int height) {

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int mx = dx[i] + location.x;
                int my = dy[i] + location.y;

                if (mx < 0 || mx >= N || my < 0 || my >= N || visited[mx][my] || city[mx][my] <= height) {
                    continue;
                }

                queue.offer(new Location(mx, my));
                visited[mx][my] = true;
            }
        }
        return 1;
    }
}