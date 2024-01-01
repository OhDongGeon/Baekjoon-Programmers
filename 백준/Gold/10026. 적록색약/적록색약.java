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
    static char[][] RGB;
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        RGB = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String color = br.readLine();
            for (int j = 0; j < N; j++) {
                RGB[i][j] = color.charAt(j);
            }
        }

        int answer1 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    answer1++;
                    bfs(i, j, RGB[i][j]);
                }
                if (RGB[i][j] == 'G') {
                    RGB[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N][N];

        int answer2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    answer2++;
                    bfs(i, j, RGB[i][j]);
                }
            }
        }

        System.out.println(answer1 + " " + answer2);
    }

    static void bfs(int iIdx, int jIdx, char color) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(iIdx, jIdx));

        while(!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = location.x + dx[i];
                int y = location.y + dy[i];

                if (x < 0 || x >= N || y < 0 || y >= N || visited[x][y] || RGB[x][y] != color) {
                    continue;
                }

                visited[x][y] = true;
                queue.offer(new Location(x, y));
            }
        }
    }
}