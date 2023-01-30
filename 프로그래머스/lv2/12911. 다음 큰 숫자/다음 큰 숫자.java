class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        int chk = 0;

        
        while(answer == 0) {
            n++;
            chk = Integer.bitCount(n);
            
            if(cnt == chk) {
                answer = n;
            }
        }
        
        return answer;
    }
}