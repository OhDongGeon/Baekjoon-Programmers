import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        boolean[] trouble = new boolean[10];
        if (N != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                trouble[Integer.parseInt(st.nextToken())] = true;
            }
        }
        
        int answer = Math.abs(channel - 100);
        for (int i = 0;  i <= 999999; i++) {
            String num = String.valueOf(i);
            
            boolean check = false;
            for (int j = 0; j < num.length(); j++) {
                if (trouble[num.charAt(j) - '0']) {
                    check = true;
                    break;
                }
            }
            
            if (!check) {
                answer = Math.min(answer, Math.abs(channel - i) + num.length());
            }
        }
        System.out.println(answer);
    }
}