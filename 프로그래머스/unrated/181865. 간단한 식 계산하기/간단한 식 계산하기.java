class Solution {
    public int solution(String binomial) {
        String[] spl = binomial.split(" ");
        int a = Integer.parseInt(spl[0]);
        int b = Integer.parseInt(spl[2]);
        
        int answer = 0;
        if (spl[1].equals("+")) {
            answer = a + b;
        } else if ((spl[1].equals("-"))) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        
        return answer;
    }
}