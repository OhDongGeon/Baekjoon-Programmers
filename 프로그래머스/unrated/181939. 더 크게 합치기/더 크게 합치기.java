class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int bigA = Integer.parseInt(a + "" + b);
        int bigB = Integer.parseInt(b + "" + a);
        
        if (bigA < bigB) {
            answer = bigB;
        } else {
            answer = bigA;
        }
        
        return answer;
    }
}