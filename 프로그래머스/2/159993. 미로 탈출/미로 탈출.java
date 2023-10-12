import java.util.*;

class Solution {
    
    static String[][] miro;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {1, -1, 0, 0};

    public int solution(String[] maps) {
        
        miro = new String[maps.length][maps[0].length()];
        
        int[] start = new int[2];
        int[] labor = new int[2];
        
        for (int i = 0; i < maps.length; i++) {
            String[] width = maps[i].split("");
            
            for (int j = 0; j < width.length; j++) {
                miro[i][j] = width[j];
                
                if (width[j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                }
                
                if (width[j].equals("L")) {
                    labor[0] = i;
                    labor[1] = j;
                }
            }
        }
        
        int count1 = bfs(start, "L");
        int count2 = bfs(labor, "E");
        
        if (count1 == -1 || count2 == -1) {
            return -1;
        }
        
        return count1 + count2;
    }
    
    
    public static int bfs(int[] start, String end) {
    
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});
        
        boolean[][] visited = new boolean[miro.length][miro[0].length];
        
        while (!queue.isEmpty()) {
            int y = queue.peek()[0];
            int x = queue.peek()[1];
            int cnt = queue.peek()[2];
            
            queue.poll();
            
            visited[y][x] = true;
            
            for (int i = 0; i < 4; i++) {
                int my = y + moveY[i];
                int mx = x + moveX[i];
            
                if (my >= 0 && my < miro.length && mx >= 0 && mx < miro[0].length 
                    && !visited[my][mx] && !miro[my][mx].equals("X")) {
                    
                    if (miro[my][mx].equals(end)) {
                        return cnt + 1;
                    }
                    
                    queue.offer(new int[]{my, mx, cnt + 1});
                    visited[my][mx] = true;
                }
            }
        }
        
        return -1;
    }
}           