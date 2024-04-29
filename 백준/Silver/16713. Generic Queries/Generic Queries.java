import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            numbers[i] ^= (numbers[i - 1] ^ Integer.parseInt(st.nextToken()));
        }
        
        int answer = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            answer ^= (numbers[end] ^ numbers[start - 1]);
        }
        System.out.println(answer);
    }
}