class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        boolean[] check = new boolean[46];
        
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            check[lottos[i]] = true;
        }
        
        int lucky = 0;
        for (int i = 0; i < win_nums.length; i++) {
            if (check[win_nums[i]]) {
                lucky++;
                check[win_nums[i]] = false;
            }
        }
        
        answer[0] = Math.abs(lucky + zero - 7)  == 7 ? 6 : Math.abs(lucky + zero - 7);
        answer[1] = Math.abs(lucky - 7) == 7 ? 6 : Math.abs(lucky - 7);
    
        return answer;
    }
}