import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int zi = Integer.parseInt(st.nextToken());
        int han = Integer.parseInt(st.nextToken());
        int answer = 0;
        
        while (zi != han) {
            zi = (zi / 2) + (zi % 2); 
            han = (han / 2) + (han % 2); 
            answer++;
        }
        
        System.out.println(answer);
    }
}