import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = 1;

            for (int j = 0; j < b; j++) {
                answer = (answer * a) % 10;
            }
            if (answer == 0) {
                answer = 10;
            }
            System.out.println(answer);
        }
    }
}