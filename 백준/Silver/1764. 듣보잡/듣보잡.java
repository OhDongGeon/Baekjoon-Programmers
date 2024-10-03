import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> hs = new HashSet<>(); 
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            hs.add(br.readLine());
        }
        
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hs.contains(name)) {
                arr.add(name);
            }
        }
        
        Collections.sort(arr);
        
        System.out.println(arr.size());
        for (String item : arr) {
            System.out.println(item);
        }
    }
}