class Solution {
    int cnt = 0;
    
    public void TargetNumber(int[] numbers, int target, int depth, int sum) {
        if(depth == numbers.length) {
            if(target == sum) {
                cnt++;
            }
        } else {
            TargetNumber(numbers, target, depth + 1, sum + numbers[depth]);
            TargetNumber(numbers, target, depth + 1, sum - numbers[depth]);  
        }
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        TargetNumber(numbers, target, 0, 0);
        return answer = cnt;
    }
}