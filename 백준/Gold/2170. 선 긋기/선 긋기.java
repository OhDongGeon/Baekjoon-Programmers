import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] lines = new int[N][2];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            lines[i][0] = Integer.parseInt(line.split(" ")[0]);
            lines[i][1] = Integer.parseInt(line.split(" ")[1]);
        }

        Arrays.sort(lines, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });


        int start = lines[0][0];
        int end = lines[0][1];
        int answer = end - start;
        for (int i = 1; i < N; i++) {
            if (start <= lines[i][0] && lines[i][1] <= end ) {
                continue;
            } else if (lines[i][0] < end) {
                answer += lines[i][1] - end;
            } else {
                answer += lines[i][1] - lines[i][0];
            }
            start = lines[i][0];
            end = lines[i][1];
        }
        System.out.println(answer);
    }
}