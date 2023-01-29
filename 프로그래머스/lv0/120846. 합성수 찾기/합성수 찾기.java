class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            cnt = 0;
            for(int j = 1; j * j <= i; j++) {
                if(j * j == n) {
                    cnt ++;
                } else if(i % j == 0) {
                     cnt += 2;
                }
                
                if(3 <= cnt) {
                    answer++;
                    break;
                }
            }

        }
        return answer;
    }
}