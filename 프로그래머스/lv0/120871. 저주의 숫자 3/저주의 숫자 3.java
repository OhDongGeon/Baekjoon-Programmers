class Solution {
    public int solution(int n) {
        int answer = 0;
        // x 숫자중 3들어가는거, 3의 배수
        
        for(int i = 1; i <= n; i++) {
            answer++;
            while(answer % 3 == 0 || Integer.toString(answer).contains("3")) {
                 answer++;
            }
        }
        
        return answer;   
    }
}