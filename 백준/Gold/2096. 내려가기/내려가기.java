import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] maxNum = new int[N + 1][4];
        int[][] minNum = new int[N + 1][4];
       
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            
            if (i == 1) {
                maxNum[i][1] = minNum[i][1] = one;
                maxNum[i][2] = minNum[i][2] = two;
                maxNum[i][3] = minNum[i][3] = three;
                continue;
            }
            
            maxNum[i][1] = one + Math.max(maxNum[i - 1][1], maxNum[i - 1][2]);
            maxNum[i][2] = two + Math.max(maxNum[i - 1][1], Math.max(maxNum[i - 1][2], maxNum[i - 1][3]));
            maxNum[i][3] = three + Math.max(maxNum[i - 1][2], maxNum[i - 1][3]);
            
            minNum[i][1] = one + Math.min(minNum[i - 1][1], minNum[i - 1][2]);
            minNum[i][2] = two + Math.min(minNum[i - 1][1], Math.min(minNum[i - 1][2], minNum[i - 1][3]));
            minNum[i][3] = three + Math.min(minNum[i - 1][2], minNum[i - 1][3]);
        }
        System.out.println(Math.max(maxNum[N][1], Math.max(maxNum[N][2], maxNum[N][3])) + " " + Math.min(minNum[N][1], Math.min(minNum[N][2], minNum[N][3])));
    }
}