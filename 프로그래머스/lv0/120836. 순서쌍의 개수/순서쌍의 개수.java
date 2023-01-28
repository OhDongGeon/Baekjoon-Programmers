class Solution {
    public int solution(int n) {
        int answer = 0;
        if(1 <= n && n <= 1000000) {
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}