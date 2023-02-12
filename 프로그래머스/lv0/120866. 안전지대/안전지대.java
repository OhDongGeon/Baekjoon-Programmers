class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] x = {-1, -1, -1, 1, 1, 0,  1,  0};
        int[] y = {-1,  0,  1, 0, 1, 1, -1, -1};
        boolean[][] chk = new boolean[board.length][board.length];
        
        
        for(int i = 0; i < board.length; i++) {
             for(int j = 0; j < board[i].length; j++) {
                 for(int k = 0; k < x.length; k++) {
                     int move_X = i + x[k];
                     int move_Y = j + y[k];
                     
                     if(0 <= move_X && move_X < board.length && 
                        0 <= move_Y && move_Y < board.length && board[move_X][move_Y] == 1) {
                         chk[i][j] = true;
                     }
                     
                     if(board[i][j] == 1) {
                         chk[i][j] = true;
                     }
                 }
             }
        }
        
         for(int i = 0; i < chk.length; i++) {
             for(int j = 0; j < chk[i].length; j++) {
                 if(!chk[i][j]) {
                     answer++;
                 }
             }
         }
        
        return answer;
    }
}