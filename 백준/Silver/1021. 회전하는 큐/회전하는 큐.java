import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }
        
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            while (arr.getFirst() != num) {
                if (arr.indexOf(num) <= arr.size() / 2) {
                    arr.addLast(arr.removeFirst());
                } else {
                    arr.addFirst(arr.removeLast());
                }
                answer++;
            }
            
            if (arr.getFirst() == num) {
                arr.removeFirst();
            }
        }
        
        System.out.println(answer);
    }
}