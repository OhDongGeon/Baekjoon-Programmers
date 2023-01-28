class Solution {
    public int solution(int n) {
        int answer = 2;
        int sqrt = (int)Math.sqrt(n);
        if(Math.pow(sqrt, 2) == n) {
            answer = 1;
        }
        return answer;
    }
}