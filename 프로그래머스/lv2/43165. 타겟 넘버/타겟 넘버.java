class Solution {
    int cnt = 0;
    
    public void TargetNumber(int[] numbers, int target, int i, int sum) {
        if(i == numbers.length) {
            if(target == sum) {
                cnt++;
            }
        } else {
            TargetNumber(numbers, target, i + 1, sum + numbers[i]);
            TargetNumber(numbers, target, i + 1, sum - numbers[i]);  
        }
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        TargetNumber(numbers, target, 0, 0);
        return answer = cnt;
    }
}