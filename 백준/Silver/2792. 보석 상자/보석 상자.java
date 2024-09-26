import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[M];
        int left = 1;
        int mid = 0;
        int right = 0;
        int answer = 0;
        
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }
        
        while (left <= right) {
            int sum = 0;
            mid = (left + right) / 2;
            
            for (int i = 0; i < M; i++) {
                sum += (arr[i] % mid == 0 ? arr[i] / mid : arr[i] / mid + 1);
            }
            
            if (sum > N) {
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }
        
        System.out.println(answer);
    }
}