import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] space = new int[M][N];
        int[] spaceNumber = new int[N];
        int[] order;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                spaceNumber[j] = Integer.parseInt(st.nextToken());
            }

            order = Arrays.stream(spaceNumber).sorted().distinct().toArray();

            for (int j = 0; j < N; j++) {
                space[i][j] = binarySearch(spaceNumber[j], order);
            }
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                if (Arrays.equals(space[i], space[j])) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    static int binarySearch(int spaceNumber, int[] order) {

        int left = 0;
        int right = order.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (spaceNumber < order[mid]) {
                right = mid - 1;
            } else if (spaceNumber > order[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}