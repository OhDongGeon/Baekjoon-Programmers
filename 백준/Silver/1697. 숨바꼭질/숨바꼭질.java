import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static int[] arr = new int[100_001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(); 
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        arr[N] = 1;
        
        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = now - 1;
                } else if (i == 1) {
                    next = now + 1;
                } else {
                    next = now * 2;
                }

                if (next == K) {
                    System.out.println(arr[now]);
                    return;
                }

                if (next < 0 || next >= arr.length || arr[next] != 0) {
                    continue;
                }

                queue.offer(next);
                arr[next] = arr[now] + 1;
            }
        }
    }
}