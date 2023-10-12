import java.util.*;

class Solution {
    
    static boolean[] visited;
    static int[] infoCopy;
    static int[][] edgesCopy;
    static int maxSheep = 0;
    
    public int solution(int[] info, int[][] edges) {

        visited = new boolean[info.length];
        infoCopy = info;
        edgesCopy = edges;
        
        // dfs (방문할 노드, 양의수, 늑대수)
        dfs(0, 0, 0);
        
        return maxSheep;
    }
    
    
    public static void dfs (int nextNode, int sheepCnt, int wolfCnt) {
        visited[nextNode] = true;
        
        // 다음 방문할 노트가 양이면 양의 수 증가 아니면 늑대의 수 증가
        if (infoCopy[nextNode] == 0) {
            sheepCnt++;
            // 최대 양의 수
            maxSheep = Math.max(maxSheep, sheepCnt);
        } else {
            wolfCnt++;
        }
        
        // 양이 늑대의 수와 같거나 작으면 잡아 먹힌다!
        if (sheepCnt <= wolfCnt) {
            return;
        }
        
        for (int i = 0; i < edgesCopy.length; i++) {
            if (visited[edgesCopy[i][0]] && !visited[edgesCopy[i][1]]) {
                dfs(edgesCopy[i][1], sheepCnt, wolfCnt);
                visited[edgesCopy[i][1]] = false;
                
                // 전체 노드가 양일 경우
                if (maxSheep == infoCopy.length) {
                    return;
                }
            }
        }
    }
}