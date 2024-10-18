import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        while (true) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == -1) {
                break;
            }
            
            if (num == 0) {
                queue.remove();
            } else if (size > queue.size()) {
                queue.add(num);
            }
        }
        
        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            for (int item : queue) {
                sb.append(item).append(" ");
            }
        }
        
        System.out.print(sb);
    }
}