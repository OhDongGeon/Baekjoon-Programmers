import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNumber = 0;

        while (true) {

            int N = Integer.parseInt(br.readLine());

            if (N == 0) {
                break;
            }

            caseNumber++;
            int[][] map = new int[N][3];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                map[i][0] = Integer.parseInt(line.split(" ")[0]);
                map[i][1] = Integer.parseInt(line.split(" ")[1]);
                map[i][2] = Integer.parseInt(line.split(" ")[2]);

                if (i == 0) {
                    map[i][2] += map[i][1];
                } else if (i == 1) {
                    map[i][0] += map[i - 1][1];
                    map[i][1] += Math.min(map[i][0], Math.min(map[i - 1][1], map[i - 1][2]));
                    map[i][2] += Math.min(map[i][1], Math.min(map[i - 1][1], map[i - 1][2]));
                } else {
                    map[i][0] += Math.min(map[i - 1][0], map[i - 1][1]);
                    map[i][1] += Math.min(map[i][0], Math.min(map[i - 1][0], Math.min(map[i - 1][1], map[i - 1][2])));
                    map[i][2] += Math.min(map[i][1], Math.min(map[i - 1][1], map[i - 1][2]));
                }
            }
            
            System.out.println(caseNumber + ". " + map[N - 1][1]);
        }
    }
}