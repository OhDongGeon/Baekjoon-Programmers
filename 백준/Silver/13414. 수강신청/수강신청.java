import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        
        for (int i = 0; i < L; i++) {
            String num = br.readLine();
            hs.remove(num); 
            hs.add(num);
        }
        
        int idx = 0;
        for (String item : hs) {
            System.out.println(item);
            idx++;
            
            if (idx == K) {
                break;
            }
        }
    }
}