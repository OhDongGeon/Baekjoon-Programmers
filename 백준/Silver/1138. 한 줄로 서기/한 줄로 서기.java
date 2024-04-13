import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = N; i>= 1; i--) {
            list.add(height[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (int item : list) {
            sb.append(item).append(" ");
        }
        System.out.println(sb);
    }
}