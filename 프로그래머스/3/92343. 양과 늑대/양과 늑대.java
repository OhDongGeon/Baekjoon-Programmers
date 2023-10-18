class Solution {
    
    static boolean[] visited;
    static int[] infoCopy;
    static int[][] edgesCopy;
    static int maxSheep = 0;
    
    public int solution(int[] info, int[][] edges) {
        
        visited = new boolean[info.length];
        infoCopy = info;
        edgesCopy = edges;
        
        dfs(0, 0, 0);
        
        return maxSheep;
    }
    
    public static void dfs(int next, int sheepCnt, int wolfCnt) {
        
        visited[next] = true;
        
        if (infoCopy[next] == 0) {
            sheepCnt++;
            maxSheep = Math.max(maxSheep, sheepCnt);
        } else {
            wolfCnt++;
        }
        
        if (sheepCnt <= wolfCnt) {
            return;
        }
        
        for (int i = 0; i < edgesCopy.length; i++) {
            if (visited[edgesCopy[i][0]] && !visited[edgesCopy[i][1]]) {
                dfs(edgesCopy[i][1], sheepCnt, wolfCnt);
                visited[edgesCopy[i][1]] = false;
            }
        }
    }
    
}