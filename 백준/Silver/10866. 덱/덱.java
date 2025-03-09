import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String move = st.nextToken();
   
            switch (move) {
                case "push_front" :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}