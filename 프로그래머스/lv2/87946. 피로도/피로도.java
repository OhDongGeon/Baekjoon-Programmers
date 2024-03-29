class Solution {
    int answer = 0;
    boolean[] chk;
    
    public int solution(int k, int[][] dungeons) {
        chk = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, int cnt) {
        
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k && !chk[i]) {
                chk[i] = true;
                dfs(k - dungeons[i][1], dungeons, cnt + 1);
                chk[i] = false;
            }
            
        }
        answer = Math.max(answer, cnt);
    }
}