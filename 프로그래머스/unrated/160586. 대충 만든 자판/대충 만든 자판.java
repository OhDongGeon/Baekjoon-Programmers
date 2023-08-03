import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                
                String word = targets[i].charAt(j) + "";
                int minIdx = Integer.MAX_VALUE;
                
                for (int k = 0; k < keymap.length; k++) {
                    
                    int idx = keymap[k].indexOf(word) + 1;
                    if (idx == 0) {
                        continue;
                    }
                    minIdx = Math.min(minIdx, idx);
                }
                if (minIdx == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += minIdx;
            }
        }
        
        return answer;
    }
}