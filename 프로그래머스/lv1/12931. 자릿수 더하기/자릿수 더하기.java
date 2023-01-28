import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nums = Integer.toString(n).split("");
        
        for(int i = 0; i < nums.length; i++) {
            answer += Integer.parseInt(nums[i]);
        }
  
        return answer;
    }
}