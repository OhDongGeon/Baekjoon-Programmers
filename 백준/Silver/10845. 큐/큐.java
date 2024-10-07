import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        int back = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    back = num;
                    queue.offer(num);
                    break;
                case "pop" :
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");          
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(queue.isEmpty() ? -1 : queue.peek() ).append("\n");        
                    break;
                case "back" :
                    sb.append(queue.isEmpty() ? -1 : back).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }   
}