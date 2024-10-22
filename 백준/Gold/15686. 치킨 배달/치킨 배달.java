import java.util.*;
import java.io.*;

class Location {
    int x;
    int y;
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N, M, answer;
    static int[][] map;
    static boolean[] visited;
    static ArrayList<Location> house;
    static ArrayList<Location> chicken;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        house = new ArrayList<>();
        chicken = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                
                if (map[i][j] == 1) {
                    house.add(new Location(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Location(i, j));
                }
            }
        }
        
        visited = new boolean[chicken.size()];
        answer = Integer.MAX_VALUE;
        dfs(0, 0);
        System.out.println(answer);
    }
    
    static void dfs(int start, int cnt) {
        
        if (cnt == M) {
            int total = 0;
            for (int i = 0; i < house.size(); i++) {
                int value = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (visited[j]) {
                        int sum = Math.abs(house.get(i).x - chicken.get(j).x) 
                                + Math.abs(house.get(i).y - chicken.get(j).y);
                        
                        value = Math.min(value, sum);
                    }
                }
                total += value;
            }
            answer = Math.min(answer, total);
            return;
        }
        
        
        for (int i = start; i < chicken.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, cnt + 1);
                visited[i] = false;
            }
        }
    }
}