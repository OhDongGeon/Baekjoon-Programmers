class Solution {
    //               상, 하, 좌, 우
    static int[] x = {0, 0, -1, 1};
    static int[] y = {1, -1, 0, 0};
    static char[][] place;
    static boolean[][] visited;
    static int value = 1;

    public int[] solution(String[][] places) {
        
        int[] answer = new int[places.length];
        
        for (int i = 0; i < places.length; i++) {
            
            place = new char[5][5];
            visited = new boolean[5][5];

            for (int j = 0; j < places[i].length; j++) {
                place[j] = places[i][j].toCharArray();
            }
            
            for (int row = 0; row < 5 ; row++) {
                for (int col = 0; col < 5; col++) {
                    if (place[row][col] == 'P') {
                        dfs(row, col, 0);
                        if (value == 0) {
                            break;
                        }
                    }
                }
                if (value == 0) {
                    break;
                }
            }
            answer[i] = value;
            value = 1;
        }
        return answer;
    }
    
    
    public static void dfs(int row, int col, int endCnt) {
        
        if (endCnt >= 2) {
            return;
        }
        
        visited[row][col] = true;
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int moveY = row + y[i]; // 상하
            int moveX = col + x[i]; // 좌우
            
            if (moveY < 0 || moveY >= 5 || moveX < 0 || moveX >= 5 || visited[moveY][moveX]) {
                continue;
            }
            
            if (place[moveY][moveX] == 'O') {
                dfs(moveY, moveX, endCnt + 1);
            } else if (place[moveY][moveX] == 'P') {
                value = 0;
                return;
            }
        }
    }
}











