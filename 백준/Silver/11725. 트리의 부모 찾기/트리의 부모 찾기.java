import java.io.*;
import java.util.*;

public class Main {
    
    static int[] answer;
    static boolean[] visited;
    static List<List<Integer>> graph;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            graph.get(num1).add(num2);
            graph.get(num2).add(num1);
        }
        
        answer = new int[N + 1];
        visited = new boolean[N + 1];
        bfs(1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }
    
    public static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        
        while (!qu.isEmpty()) {
            int node = qu.poll();
            
            for (Integer nextNode : graph.get(node)) {
                if (!visited[nextNode]) {
                    qu.add(nextNode);
                    answer[nextNode] = node;
                    visited[nextNode] = true;
                }
            }
        }
    }
}