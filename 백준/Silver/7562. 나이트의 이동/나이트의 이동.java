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

    static int chessIndex, firstRow, firstCol, answerRow, answerCol;

    static int[] dRow = {2, 1, -1, -2, -2, -1, 1, 2}; // 시계방향으로 이동
    static int[] dCol = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] chess;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            chessIndex = Integer.parseInt(br.readLine());
            chess = new int[chessIndex][chessIndex];
            visited = new boolean[chessIndex][chessIndex];

            StringTokenizer st = new StringTokenizer(br.readLine());
            firstRow = Integer.parseInt(st.nextToken());
            firstCol = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            answerRow = Integer.parseInt(st.nextToken());
            answerCol = Integer.parseInt(st.nextToken());

            bfs();

            System.out.println(chess[answerRow][answerCol]);
        }
    }

    static void bfs() {

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(firstRow, firstCol));
        visited[firstRow][firstCol] = true;

        while(!queue.isEmpty()) {
            Location location = queue.poll();
            int preRow = location.row;
            int preCol = location.col;

            for (int i = 0; i < 8; i++) {
                int row = preRow + dRow[i];
                int col = preCol + dCol[i];

                if (row < 0 || row >= chessIndex || col < 0 || col >= chessIndex || visited[row][col]) {
                    continue;
                }

                visited[row][col] = true;
                chess[row][col] = chess[preRow][preCol] + 1;
                queue.offer(new Location(row, col));
            }
        }
    }
}
