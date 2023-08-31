import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Character[][] mbti = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[] scores = {0, 3, 2, 1, 0, 1, 2, 3};
        Map<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            int score = scores[choices[i]];
                
            if (choices[i] < 4) {
                char key = survey[i].charAt(0);
                hm.put(key, hm.getOrDefault(key, 0) + score);
            } else {
                char key = survey[i].charAt(1);
                hm.put(key, hm.getOrDefault(key, 0) + score);
            }
        }
        
        String answer = "";
        for (int i = 0; i < mbti.length; i++) {
            if (hm.getOrDefault(mbti[i][0], 0) < hm.getOrDefault(mbti[i][1], 0)) {
                answer += mbti[i][1];
            } else {
                answer += mbti[i][0];
            }
        }
        
        return answer;
    }
}