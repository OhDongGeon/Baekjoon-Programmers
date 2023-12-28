import java.io.*;
import java.util.*;

class Location {

    int x;
    int y;
    int day;

    public Location(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.day = day;
    }
}

public class Main {

    static int M, N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static Queue<Location> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.offer(new Location(i, j, 0));
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

            for (int i = 0; i < 4; i++) {
                int x = location.x + dx[i];
                int y = location.y + dy[i];

                if (x < 0 || x >= N || y < 0 || y >= M || arr[x][y] == -1 || arr[x][y] == 1) {
                    continue;
                }

                arr[x][y] = 1;
                queue.offer(new Location(x, y, day + 1));
            }
        }

        if (chkTomato()) {
            System.out.println(-1);
        } else {
            System.out.println(day);
        }
    }

    static boolean chkTomato() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
