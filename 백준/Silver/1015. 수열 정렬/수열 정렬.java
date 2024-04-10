import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] numbers = new int[A];
        int[][] numberSort = new int[A][2];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            int number = Integer.parseInt(st.nextToken());
            numbers[i] = numberSort[i][0] = number;
            numberSort[i][1] = i;
        }

        Arrays.sort(numberSort, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                if (i == numberSort[j][1]) {
                    sb.append(j).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}