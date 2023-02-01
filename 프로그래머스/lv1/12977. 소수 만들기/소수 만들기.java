class Solution {
    public int cnt(int sum) {
       for(int i = 1; i * i <= sum; i++) {
            if(sum % i == 0 && i != 1 && i != sum) {
                return 0;
            }
        }
        return 1;
    } 
    
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
             for(int j = i + 1; j < nums.length - 1; j++) {
                 for(int k = j + 1; k < nums.length; k++) {
                     answer += cnt(nums[i] + nums[j] + nums[k]);
                 }
             }
        }
        

        return answer;
    }
}