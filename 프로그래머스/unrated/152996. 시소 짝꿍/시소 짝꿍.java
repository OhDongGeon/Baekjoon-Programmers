import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Map<Double, Integer> hm = new HashMap<>();
        long answer = 0;
        
        Arrays.sort(weights);
        
        for (int item : weights) {
            if (hm.containsKey(item * 1.0)) {
                answer += hm.get(item * 1.0);
            }
            
            if (hm.containsKey(item * 2.0 / 3.0)) {
                answer += hm.get(item * 2.0 / 3.0);
            }
            
            if (hm.containsKey(item * 3.0 / 4.0)) {
                answer += hm.get(item * 3.0 / 4.0);
            }
            
            if (hm.containsKey(item / 2.0)) {
                answer += hm.get(item / 2.0);
            }
            
            hm.put(item * 1.0, hm.getOrDefault(item * 1.0, 0) + 1);
        }
        
        return answer;
    }
}