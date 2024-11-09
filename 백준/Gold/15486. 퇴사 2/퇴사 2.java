import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[] arr = new int[N + 2];
        int max = 0;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            int finishDay = i + day;
            
            max = Math.max(max, arr[i]);
            if (finishDay <= N + 1) {
                arr[finishDay] = Math.max(arr[finishDay], max + cost);
            }
        }
        System.out.println(Math.max(max, arr[N + 1]));
    }
}