import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int sum = 0;
        HashSet<Integer> hs = new HashSet();
        
        for(int i = 0; i < elements.length; i++) {
            sum = 0;
            
            for(int j = i; j < elements.length + i; j++) {
                if(elements.length <= j) {
                    sum += elements[j - elements.length];
                } else {
                    sum += elements[j];
                }
                hs.add(sum);
            }
        }
        answer = hs.size();
        return answer;
    }
}