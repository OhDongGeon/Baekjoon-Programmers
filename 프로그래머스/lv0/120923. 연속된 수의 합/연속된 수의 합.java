class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total % num == 0 ? (total / num) - (num / 2) : (total / num) - (num / 2) + 1;
        int cnt = 0;
        
        while (cnt < num) {
            answer[cnt] = start + cnt; 
            cnt++;
        }
        
        
        
        return answer;
    }
}