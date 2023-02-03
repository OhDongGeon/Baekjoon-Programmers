class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int row_Max = board[1] / 2;
        int col_Max = board[0] / 2;
        
        
        for(String item : keyinput) {
            if(item.equals("up")) {
                answer[1]++;
            } else if(item.equals("down")) {
                answer[1]--;
            } else if(item.equals("left")) {
                answer[0]--;
            } else if(item.equals("right")) {
                answer[0]++;
            }
            
            if(answer[0] > col_Max) {
                answer[0] = col_Max;
            }
            if(answer[0] < col_Max * -1) {
                answer[0] = col_Max * -1;
            }
            if(answer[1] > row_Max) {
                answer[1] = row_Max;
            }
            if(answer[1] < row_Max * -1) {
                answer[1] = row_Max * -1;
            }
        }
        
        return answer;
    }
}