class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int x = board.length + 1;
        int y = board[0].length + 1;
        int[][] plusBoard = new int[x][y];
        
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                 plusBoard[i][j] = board[i - 1][j - 1];
            }
        }
        
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if (plusBoard[i][j] == 1) {
                    int top = plusBoard[i - 1][j];
                    int left = plusBoard[i][j - 1];
                    int topleft = plusBoard[i - 1][j - 1];
                    
                    plusBoard[i][j] = Math.min(Math.min(top, left), topleft) + 1;
                    answer = Math.max(answer, plusBoard[i][j]);
                }
            }
        }

        return answer * answer;
    }
}