import java.io.*;
import java.util.*;

public class Main {
    
    static int computer, network, answer;
    static int[][] net;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        network = Integer.parseInt(br.readLine());
        net = new int[computer + 1][computer + 1];
        
        for (int i = 0; i < network; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());
            
            net[com1][com2] = net[com2][com1] = 1;
        }
        
        visited = new boolean[computer + 1];
        answer = 0;
        bfs(1);
        
        System.out.println(answer == 0 ? 0 : --answer);
    }
    
    static void bfs(int start) {
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            answer++;
            for (int i = 1; i <= computer; i++) {
                if (!visited[i] && net[num][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}