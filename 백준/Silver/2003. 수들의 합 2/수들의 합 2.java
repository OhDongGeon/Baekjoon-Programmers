import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int[] num = new int[N];
        for (int i = 0; i < N; i++) { 
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        
        for (int i = 0; i < num.length; i++) {
            int idx = i;
            int sum = 0;
            
            while(sum < M) {
                sum += num[idx++];
                
                if (sum == M) {
                    count++;    
                }
                
                if (idx >= num.length) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}