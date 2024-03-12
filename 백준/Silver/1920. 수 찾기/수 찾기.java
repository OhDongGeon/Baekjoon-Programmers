import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        line = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(Integer.parseInt(line[i]), A));
        }
    }

    static int binarySearch (int findNum, int[] A) {

        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (A[mid] == findNum) {
                return 1;
            } else if (A[mid] < findNum) {
                left = mid + 1;
            } else if (A[mid] > findNum) {
                right = mid - 1;
            }
        }

        return 0;
    }
}