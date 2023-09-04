import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        Stack<Integer> box = new Stack<>(); 
        int answer = 0;
        
        for (int i = 0; i < moves.length; i++) {
            int num = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                if (board[j][num] != 0) {
                    if (!box.isEmpty() && box.peek() == board[j][num]) {
                        box.pop();
                        answer += 2;
                    } else {
                        box.push(board[j][num]);
                    }
                    board[j][num] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}