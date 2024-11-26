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
        
        answer[0] = 7 - lucky - zero == 7 ? 6 : 7 - lucky - zero;
        answer[1] = 7 - lucky == 7 ? 6 : 7 - lucky;
    
        return answer;
    }
}