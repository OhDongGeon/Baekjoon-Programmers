import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashSet hashset = new HashSet();
        
        if((1 <= nums.length && nums.length <= 10000) && nums.length % 2 == 0) {
            for(int item: nums) {
                if(1 <= item && item <= 200000) {
                    hashset.add(item);
                }
            }
            
            if(answer > hashset.size()) {
                answer = hashset.size();
            }
        }
        return answer;
    }
}