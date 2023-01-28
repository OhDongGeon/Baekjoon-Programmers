import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> nums = new ArrayList();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                nums.add(numlist[i]);
            }
        }
        
        answer = new int[nums.size()];
        
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}