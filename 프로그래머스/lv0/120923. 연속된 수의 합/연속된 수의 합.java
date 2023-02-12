class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // 시작
        // total / num 은 가운데 숫자
        // num / 2는 가운데 숫자의 좌측 우측갈 수 있는 최대수
        // total % num == 0 아닌경우 숫자의 좌측 우측갈 수 있는 최대수 줄어 듦
        int start = total % num == 0 ? (total / num) - (num / 2) : (total / num) - (num / 2) + 1;
        int cnt = 0;
        
        while (cnt < num) {
            answer[cnt] = start + cnt; 
            cnt++;
        }
        
        return answer;
    }
}