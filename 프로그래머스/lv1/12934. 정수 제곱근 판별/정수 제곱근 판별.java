class Solution {
    public long solution(long n) {
        long answer = 0;
        long chk = (long)Math.sqrt(n);
        answer = chk * chk;
        if(answer != n) {
            answer = -1;
        } else {
            answer = (long)Math.pow(chk + 1, 2);
        }
        
        return answer;
    }
}