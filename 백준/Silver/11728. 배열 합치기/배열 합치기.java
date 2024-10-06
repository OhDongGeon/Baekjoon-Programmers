import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int idxA = Integer.parseInt(st.nextToken());
        int idxB = Integer.parseInt(st.nextToken());
        int[] idx = new int[idxA + idxB];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < idxA; i++) {
            idx[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < idxB; i++) {
            idx[i + idxA] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(idx);
        
        StringBuilder sb = new StringBuilder();
        for (int item : idx) {
            sb.append(item).append(" ");
        }
        System.out.println(sb);
    }
}