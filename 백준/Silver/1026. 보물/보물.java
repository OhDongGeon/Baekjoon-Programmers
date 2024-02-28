import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(first[i]);
            B[i] = Integer.parseInt(second[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += A[i] * B[i];
        }
        System.out.println(answer);
    }
}