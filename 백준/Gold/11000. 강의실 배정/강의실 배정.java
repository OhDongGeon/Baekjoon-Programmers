import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] classes = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            classes[i][0] = Integer.parseInt(st.nextToken());
            classes[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(classes, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            if (pq.isEmpty()) {
                pq.offer(classes[i][1]);
                continue;
            }

            if (pq.peek() > classes[i][0]) {
                pq.offer(classes[i][1]);
            } else {
                pq.offer(classes[i][1]);
                pq.poll();
            }
        }
        System.out.println(pq.size());
    }
}