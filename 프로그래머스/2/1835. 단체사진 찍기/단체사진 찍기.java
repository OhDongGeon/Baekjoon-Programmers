class Solution {
    
    static String[] dataCopy;
    static String[] picture = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] visited = new boolean[8];
    static int answer;
    
    public int solution(int n, String[] data) {
        answer = 0;
        dataCopy = data;
        
        dfs(0, "");
        
        return answer;
    }
    
    public static void dfs(int cnt, String pictureSeq) {
        
        if (cnt == 8) {
            if (dataCheck(pictureSeq)) {
                answer++;
            }
            return;
        }
        
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(cnt + 1, pictureSeq + picture[i]);
                visited[i] = false;
            }
        }
    }
    
    
    public static boolean dataCheck(String pictureSeq) {
        
        for (String data : dataCopy) {
            int firstLocation = pictureSeq.indexOf(data.charAt(0));
            int secondLocation = pictureSeq.indexOf(data.charAt(2));
            int count = data.charAt(4) - '0';
            char check = data.charAt(3);
 
            if (check == '=') {
                if (Math.abs(firstLocation - secondLocation) - 1 != count) {
                    return false;
                }
            } else if (check == '<') {
                if (Math.abs(firstLocation - secondLocation) - 1 >= count) {
                    return false;
                }
            } else {
                if (Math.abs(firstLocation - secondLocation) - 1 <= count) {
                    return false;
                }
            }
        }
        return true;
    }
}