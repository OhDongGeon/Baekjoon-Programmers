import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        while (true) {
            if (n % 5 == 0) {
                answer += n / 5;
                break;
            } else {
                n -= 2;
                answer++;
            }
            
            if (n < 0) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
    }
}