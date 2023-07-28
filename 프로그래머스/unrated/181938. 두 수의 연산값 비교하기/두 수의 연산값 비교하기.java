class Solution {
    public int solution(int a, int b) {
        StringBuilder sum = new StringBuilder();
        sum.append(a);
        sum.append(b);
        
        int sumNum = Integer.parseInt(sum.toString());
        int mul = 2 * a * b;
        
        int answer = sumNum < mul ? mul : sumNum; 
        return answer;
    }
}