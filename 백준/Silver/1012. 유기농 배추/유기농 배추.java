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

    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int answer = 0;
            
            arr = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                arr[Y][X] = 1;
            }
            
            for (int j = 0; j < N; j++) {
                for (int l = 0; l < M; l++) {
                    if (!visited[j][l] && arr[j][l] == 1) {
                        visited[j][l] = true;
                        bfs(j, l);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    static void bfs(int iIdx, int jIdx) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(iIdx, jIdx));

        while(!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = location.x + dx[i];
                int y = location.y + dy[i];

                if (x < 0 || x >= N || y < 0 || y >= M || visited[x][y] || arr[x][y] == 0) {
                    continue;
                }

                visited[x][y] = true;
                queue.offer(new Location(x, y));
            }
        }
    }
}