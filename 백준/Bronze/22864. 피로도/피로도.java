import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int stamina = 0;
        int answer = 0;
        
        for (int i = 0; i < 24; i++) {
            if (stamina + A > M) {
                if (stamina - C < 0) {
                    stamina = 0;   
                } else {
                    stamina -= C; 
                }
            } else {
                stamina += A;
                answer += B;
            }
        }
        
        System.out.println(answer);
    }
}