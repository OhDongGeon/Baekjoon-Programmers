import java.util.*;

class Solution {
    
    static int row;
    static int col;
    static int[] dx = {0, -1, 0, 1}; // 좌우
    static int[] dy = {-1, 0, 1, 0}; // 하상
    static String[] gridCopy;
    static boolean[][][] visited;
    
    public int[] solution(String[] grid) {
        
        List<Integer> answer = new ArrayList<>();
        
        row = grid.length;
        col = grid[0].length();
        gridCopy = grid;
        visited = new boolean[row][col][4];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < 4; k++) {
                    if (!visited[i][j][k]) {
                        answer.add(cycle(i, j, k));
                    }
                }
            }
        }
        
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
    
    public static int cycle(int i, int j, int k) {
        
        int cnt = 0;
        
        while (!visited[i][j][k]) {
            cnt++;
            visited[i][j][k] = true;
            
            if(gridCopy[i].charAt(j) == 'L') {
                k = (k + 3) % 4;
            }
            if(gridCopy[i].charAt(j) == 'R') {
                k = (k + 1) % 4;
            }
            
            i = (i + dx[k] + row) % row;
            j = (j + dy[k] + col) % col;
        }
        return cnt;
    }
    
}