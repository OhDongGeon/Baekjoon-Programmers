import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < participant.length; i++) {
            if (completion.length != i && participant[i].equals(completion[i])) {
                continue;
            }
            answer = participant[i];
            break;
        }
        
        return answer;
    }
}