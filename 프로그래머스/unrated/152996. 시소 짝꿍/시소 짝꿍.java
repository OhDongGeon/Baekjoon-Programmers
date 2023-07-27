import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Double, Integer> map = new HashMap<>();
        
        Arrays.sort(weights);
        
        for (int i = 0; i < weights.length; i++) {
            if (map.containsKey(weights[i] * 1.0)) {
                answer+=map.get(weights[i] * 1.0);
            }
            if (map.containsKey(weights[i] * 2.0 / 3.0)) {
                answer+=map.get(weights[i] * 2.0 / 3.0);
            }
            if (map.containsKey(weights[i] * 3.0 / 4.0)) {
               answer+=map.get(weights[i] * 3.0 / 4.0);
            }
            if (map.containsKey(weights[i] / 2.0)) {
                answer+=map.get(weights[i] / 2.0);
            }
            
            map.put(weights[i] * 1.0, map.getOrDefault(weights[i] * 1.0, 0) + 1);
        }
        
        return answer;
    }
}