class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for (int item : numbers) {
            answer -= item;
        }
        
        return answer;
    }
} 