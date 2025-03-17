import java.io.*;
import java.util.*;

public class Main {
    
    static int K, cnt;
    static int[] cost;
    static List<Integer> arr = new ArrayList<>();
    static List<List<Integer>> graph;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 도시 개수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        K = Integer.parseInt(st.nextToken()); // 거리
        int X = Integer.parseInt(st.nextToken()); // 출발
        
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int road1 = Integer.parseInt(st.nextToken());
            int road2 = Integer.parseInt(st.nextToken());
            
            graph.get(road1).add(road2);
        }
        
        cost = new int[N + 1];
        cnt = -1;
        Arrays.fill(cost, cnt);
        
        bfs(X);
        
        StringBuilder sb = new StringBuilder();
        if (arr.isEmpty()) {
            sb.append(-1);
        } else {
            arr.stream().sorted().forEach(item -> sb.append(item).append("\n"));
        }
        System.out.println(sb);
    }
    
    static void bfs(int start) {
        
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(start);
        cost[start]++;
        
        while (!qu.isEmpty()) {
            int num  = qu.poll();
            
            if (cost[num] == K) {
                arr.add(num);
            } 
            
            for (Integer item : graph.get(num)) {
                if (cost[item] == cnt) {
                    cost[item] = cost[num] + 1;
                    qu.offer(item);
                }
            }
        }
    }
}