import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        long answer1 = (X + Y) * W;
        long answer2 = 0;
        if ((X + Y) % 2 == 0) {
            answer2 = Math.max(X, Y) * S;
        } else {
            answer2 = (Math.max(X, Y) - 1) * S + W;
        }
        long answer3 = (Math.min(X, Y)) * S + (Math.abs(X - Y)) * W;
        
        System.out.println(Math.min(answer1, Math.min(answer2, answer3)));
    }
}