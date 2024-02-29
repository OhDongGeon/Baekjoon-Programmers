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

    static int answer = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Location> J = new LinkedList<>();
    static Queue<Location> F = new LinkedList<>();
    static char[][] miro;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        miro = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String row = br.readLine();

            for (int j = 0; j < C; j++) {
                miro[i][j] = row.charAt(j);

                if (miro[i][j] == 'J') {
                    J.offer(new Location(i, j, 0));
                }
                if (miro[i][j] == 'F') {
                    F.offer(new Location(i, j));
                }
            }
        }

        System.out.println(bfs(R, C) ? answer : "IMPOSSIBLE");
    }

    static boolean bfs (int R, int C) {

        int count = 0;
        while (!J.isEmpty()) {

            int fSize = F.size();
            for (int i = 0; i < fSize; i++) {
                Location fire = F.poll();

                for (int j = 0; j < 4; j++) {
                    int fx = fire.x + dx[j];
                    int fy = fire.y + dy[j];

                    if (fx < 0 || fx >= R || fy < 0 || fy >= C || miro[fx][fy] == '#' || miro[fx][fy] == 'F') {
                        continue;
                    }

                    F.offer(new Location(fx, fy));
                    miro[fx][fy] = 'F';
                }
            }

            int jSize = J.size();
            for (int i = 0; i < jSize; i++) {
                Location jiHun = J.poll();
                count = jiHun.count;

                for (int j = 0; j < 4; j++) {
                    int jx = jiHun.x + dx[j];
                    int jy = jiHun.y + dy[j];

                    if(jx < 0 || jx >= R || jy < 0 || jy >= C) {
                        answer = count + 1;
                        return true;
                    }

                    if(miro[jx][jy] != '#' && miro[jx][jy] !='F' && miro[jx][jy] != 'J') {
                        J.offer(new Location(jx, jy, count + 1));
                        miro[jx][jy] = 'J';
                    }
                }
            }
        }
        return false;
    }
}