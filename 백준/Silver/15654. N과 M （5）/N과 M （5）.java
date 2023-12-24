import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m;
    static int[] arr;
    static int[] arrAnswer;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n];
        arrAnswer = new int[m];
        visited = new boolean[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        backtracking(0);
        
        System.out.println(sb.toString());
    }
    
    static void backtracking(int count) {
        if (m == count) {
            for (int num : arrAnswer) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arrAnswer[count] = arr[i];
                backtracking(count + 1);
                visited[i] = false;
            }
        }
    }
}