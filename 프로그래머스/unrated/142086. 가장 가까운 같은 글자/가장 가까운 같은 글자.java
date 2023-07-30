import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String key = s.charAt(i) + "";
            int next = 0;
            
            if (map.containsKey(key)) {
                next = i - map.get(key);
                answer[i] = next;
            } else {
                answer[i] = -1;
            }
            
            map.put(key, map.getOrDefault(key, i) + next);
        }
        
        return answer;
    }
}