import java.io.*;
import java.util.*;

class Image {
    int x;
    int y;

    public Image(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m, answerCnt, answerSize;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j);
                }
            }
        }

        System.out.println(answerCnt);
        System.out.println(answerSize);
    }

    static void bfs(int iIdx, int jIdx) {
        Queue<Image> queue = new LinkedList<>();
        queue.offer(new Image(iIdx, jIdx));

        int count = 0;
        while (!queue.isEmpty()) {
            Image image = queue.poll();
            count++;
            for (int i = 0; i < 4; i++) {
                int x = image.x + dx[i];
                int y = image.y + dy[i];

                if (x < 0 || x >= n || y < 0 || y >= m || arr[x][y] == 0 || visited[x][y]) {
                    continue;
                }

                visited[x][y] = true;
                queue.offer(new Image(x, y));
            }
        }
        answerCnt++;
        answerSize = Math.max(answerSize, count);
    }
}