import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            char[] ac = br.readLine().toCharArray();
            int idx = Integer.parseInt(br.readLine());
            String[] num = br.readLine().replaceAll("\\[|\\]", "").split(",");

            Deque<Integer> dq = new LinkedList<>();
            for (int j = 0; j < idx; j++) {
                dq.add(Integer.parseInt(num[j]));
            }

            System.out.println(AC(ac, dq));
        }
    }
    
    static String AC(char[] ac, Deque<Integer> dq) {
        boolean change = false;
        for (char item : ac) {
            if (item == 'R') {
                change = !change;
            } else {
                if (dq.isEmpty()) {
                    return "error";
                }

                if (change) {
                    dq.removeLast();
                } else {
                    dq.removeFirst();
                }
            }
        }

        StringBuilder sb = new StringBuilder("[");
        while (!dq.isEmpty()) {
            sb.append(change ? dq.removeLast() : dq.removeFirst());
            if (!dq.isEmpty()) {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}