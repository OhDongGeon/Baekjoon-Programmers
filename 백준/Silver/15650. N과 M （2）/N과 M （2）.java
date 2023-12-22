import java.util.*;
import java.io.*;

public class Main {

    static int[] arrays;
    static StringBuilder num = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arrays = new int[m];

        backtracking(n, m, 0, 0);

        System.out.println(num);
    }

    static void backtracking(int n, int m, int start, int count) {
        if (m == count) {
            for (int number : arrays) {
                num.append(number).append(" ");
            }
            num.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arrays[count] = i + 1;
            backtracking(n, m, i + 1, count + 1);
        }
    }
}