import java.io.*;
import java.util.*;

class Location {
    int x;
    int y;
    int z;
    int count;

    public Location(int x, int y, int z, int count) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.count = count;
    }
}


public class Main {

    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, 0, -1, 0};
    static int[] dz = {0, 0, 0, 1, 0, -1};
    static char[][][] building;
    static boolean[][][] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] lrc = br.readLine().split(" ");
            int L = Integer.parseInt(lrc[0]); // 층 수
            int R = Integer.parseInt(lrc[1]); // 행
            int C = Integer.parseInt(lrc[2]); // 열

            int[] start = new int[3];

            if (L == 0 && R == 0 && C == 0) {
                System.out.println(sb.toString());
                break;
            }
            building = new char[L][R][C];
            visited = new boolean[L][R][C];

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < R; j++) {
                    String row = br.readLine();

                    for (int k = 0; k < C; k++) {
                        building[i][j][k] = row.charAt(k);

                        if (building[i][j][k] == 'S') {
                            start[0] = i;
                            start[1] = j;
                            start[2] = k;
                        }
                    }
                }
                br.readLine();
            }
            bfs(start[0], start[1], start[2]);
        }
    }

    static void bfs (int x, int y, int z) {

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y, z, 0));
        visited[x][y][z] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();
            int mx = location.x;
            int my = location.y;
            int mz = location.z;
            int count = location.count;

            if (building[mx][my][mz] == 'E') {
                sb.append("Escaped in " + count + " minute(s).\n");
                return;
            }

            for (int i = 0; i < 6; i++) {

                mx = location.x + dx[i];
                my = location.y + dy[i];
                mz = location.z + dz[i];

                if (mx < 0 || mx >= building.length || my < 0 || my >= building[0].length || mz < 0 || mz >= building[0][0].length ||
                visited[mx][my][mz] || building[mx][my][mz] == '#') {
                    continue;
                }
                queue.offer(new Location(mx, my, mz, count + 1));
                visited[mx][my][mz] = true;
            }
        }
        sb.append("Trapped!\n");
    }
}