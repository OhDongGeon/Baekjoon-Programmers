import java.io.*;
import java.util.*;

class Location {
    int row;
    int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }
}


public class Main {

    static int M, N, K, cnt;
    static int[] dRow = {1, 0, -1, 0};
    static int[] dCol = {0, 1, 0, -1};
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int firstPointX = Integer.parseInt(st.nextToken());
            int firstPointY = Integer.parseInt(st.nextToken());
            int SecondPointX = Integer.parseInt(st.nextToken());
            int SecondPointY = Integer.parseInt(st.nextToken());

            for (int j = firstPointY; j < SecondPointY; j++) {
                for (int k = firstPointX; k < SecondPointX; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) {
                    list.add(bfs(i, j));
                    cnt++;
                }
            }
        }
        Collections.sort(list);

        System.out.println(cnt);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    static int bfs(int iIndex, int jIndex) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(iIndex, jIndex));
        arr[iIndex][jIndex] = 1;
        int count = 1;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int row = location.row + dRow[i];
                int col = location.col + dCol[i];

                if (row < 0 || row >= M || col < 0 || col >= N || arr[row][col] != 0) {
                    continue;
                }

                count++;
                arr[row][col] = 1;
                queue.offer(new Location(row, col));
            }
        }
        return count;
    }
}