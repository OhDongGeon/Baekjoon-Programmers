import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] RGB = new int[N][3];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            int R = Integer.parseInt(line.split(" ")[0]);
            int G = Integer.parseInt(line.split(" ")[1]);
            int B = Integer.parseInt(line.split(" ")[2]);

            if (i == 0) {
                RGB[i][0] = R;
                RGB[i][1] = G;
                RGB[i][2] = B;
                continue;
            }

            RGB[i][0] = R + Math.min(RGB[i - 1][1], RGB[i - 1][2]);
            RGB[i][1] = G + Math.min(RGB[i - 1][0], RGB[i - 1][2]);
            RGB[i][2] = B + Math.min(RGB[i - 1][0], RGB[i - 1][1]);
        }

        System.out.println(Math.min(RGB[N - 1][0], Math.min(RGB[N - 1][1], RGB[N - 1][2])));
    }
}