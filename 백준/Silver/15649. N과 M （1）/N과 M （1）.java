import java.io.*;
import java.util.*;

public class Main {
    
    static int[] array;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        array = new int[m];
        visited = new boolean[n];
  
        backtracking(n, m, 0);
    }
    
    static void backtracking(int n, int m, int count) {
        if (m == count) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                array[count] = i + 1;
                backtracking(n, m, count + 1);
                visited[i] = false;
            }
        }
    }  
}