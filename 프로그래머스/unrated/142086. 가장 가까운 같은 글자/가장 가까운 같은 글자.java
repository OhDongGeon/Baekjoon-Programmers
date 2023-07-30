import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            answer[i] = i - map.getOrDefault(key, i + 1); 
            map.put(key, i);
        }
        
        return answer;
    }
}