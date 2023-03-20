import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> arr = new ArrayList<>();
        char last = ' ';
        char first = ' ';
        
        for(int i = 0; i < words.length; i++) {
            if(i != 0) {
                last = words[i - 1].charAt(words[i - 1].length() - 1);
                first = words[i].charAt(0);
            }
            
            if(arr.contains(words[i]) || last != first) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } 
            
            arr.add(words[i]);
        }
        
        return answer;
    }
}