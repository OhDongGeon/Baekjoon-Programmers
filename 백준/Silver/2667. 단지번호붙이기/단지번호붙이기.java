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

    static int N, blockCount;
    static int[] dRow = {1, 0, -1, 0};
    static int[] dCol = {0, 1, 0, -1};
    static int[][] apt;
    static boolean[][] visited;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        apt = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String dong = br.readLine();
            for (int j = 0; j < N; j++) {
                apt[i][j] = dong.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apt[i][j] == 1 && !visited[i][j]) {
                    blockCount++;
                    bfs(i, j);
                }
            }
        }
        
        Collections.sort(list);
        System.out.println(blockCount);
        for (Integer item : list) {
            System.out.println(item);
        }
    }

    static void bfs(int iIndex, int jIndex) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(iIndex, jIndex));
        visited[iIndex][jIndex] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i++) {
                int row = location.row + dRow[i];
                int col = location.col + dCol[i];

                if (row < 0 || row >= N || col < 0 || col >= N || apt[row][col] == 0 || visited[row][col]) {
                    continue;
                }

                queue.offer(new Location(row, col));
                visited[row][col] = true;
                count++;
            }
        }
        list.add(count);
    }
}