import java.util.*;

class Solution {
    
    boolean[] visited;
    int[] infoCopy;
    int[][] edgesCopy;
    int maxSheep = 0;
    
    public int solution(int[] info, int[][] edges) {

        visited = new boolean[info.length];
        infoCopy = info;
        edgesCopy = edges;
        
        // dfs (방문체크, 방문할 노드, 양의수, 늑대수)
        dfs(visited, 0, 0, 0);
        
        return maxSheep;
    }
    
    
    public void dfs (boolean[] visited, int nextNode, int sheepCnt, int wolfCnt) {
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
            // 현재 방문하고 있는 노드
            return;
        }
        
        for (int i = 0; i < edgesCopy.length; i++) {

            if (visited[edgesCopy[i][0]] && !visited[edgesCopy[i][1]]) {
                dfs(visited, edgesCopy[i][1], sheepCnt, wolfCnt);
                visited[edgesCopy[i][1]] = false;
            }
        }
    }
}