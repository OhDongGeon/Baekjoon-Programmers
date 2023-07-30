import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            arr.add(my_string.substring(i, my_string.length()));
        }
        
        Collections.sort(arr);
        
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}