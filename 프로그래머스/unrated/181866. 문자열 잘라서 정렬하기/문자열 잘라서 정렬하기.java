import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] my = myString.split("x");
        Arrays.sort(my);
        
        List<String> arr = new ArrayList<>();
        for (String item : my) {
            if (!item.isEmpty()) {
                arr.add(item);
            }
        }
        
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}