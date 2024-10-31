import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        int answer = Integer.MAX_VALUE;
  
        while (end < N) {
            
            if (arr[end] - arr[start] < M) {
                end++;
                continue;
            } 
            
            if (arr[end] - arr[start] == M) {
                answer = M;
                break;
            }
            
            answer = Math.min(answer, arr[end] - arr[start]);
            start++;
        }
        System.out.println(answer);
    }
}