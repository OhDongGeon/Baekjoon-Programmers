import java.io.*;
import java.util.*;

public class Main {
    
    static ArrayList<Long> arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();
        
        if (N <= 10) {
            System.out.println(N);
            return;
        } else if (N >= 1023) {
            System.out.println(-1);
            return;
        } 
        
        for (int i = 0; i < 10; i++) {
            dfs(i, 1);
        }

        Collections.sort(arr);
        System.out.println(arr.get(N));
        
    }
    
    static void dfs(long num, int cnt) {
        
        if(cnt > 10) {
           return; 
        }
        
        arr.add(num);
        for (int i = 0; i < num % 10 ; i++) {
            dfs((num * 10) + i, cnt + 1);
        }
    }
}