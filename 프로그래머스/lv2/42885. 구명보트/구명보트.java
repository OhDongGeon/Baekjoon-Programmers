import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int chk = 0;
        
        Arrays.sort(people);
        
        for(int i = people.length - 1; i >= 0; i--) {
            if(i < chk) {
                break;
            } else if(people[i] + people[chk] <= limit) {
                answer++;
                chk++;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}