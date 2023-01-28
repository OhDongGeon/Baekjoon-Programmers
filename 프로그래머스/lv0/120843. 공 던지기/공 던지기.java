class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        if((2 < numbers.length && numbers.length < 100) && (0 < k && k < 1000)) {
            answer =  numbers[2 * (k - 1) % numbers.length];
        }
        
        return answer;
    }
}