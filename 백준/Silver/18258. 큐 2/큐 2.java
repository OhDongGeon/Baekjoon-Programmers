import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        Queue<Integer> qu = new LinkedList<>();
        StringTokenizer st;
        int last = -1;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    qu.offer(last);
                    break;
                case "pop":
                    sb.append(qu.isEmpty() ? -1 : qu.poll()).append("\n");
                    break;
                case "size":
                    sb.append(qu.size()).append("\n");
                    break;
                case "empty":
                    sb.append(qu.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(qu.isEmpty() ? -1 : qu.peek()).append("\n");
                    break;
                case "back":
                    sb.append(qu.isEmpty() ? -1 : last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}