import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        
        backTracking(0);
        
        System.out.println(sb.toString());
    }
    
    static void backTracking(int count) {
        if (m == count) {
            for (int number : arr) {
                sb.append(number).append(" ");
            }
            return;
        }
        
        for (int i = 0; i < n; i++) {
            arr[count] = i + 1;
            backTracking(count + 1);
        }
    }
}