import java.util.*;

class Solution {
    public List<String> solution(String myStr) {
        String[] arr = myStr.replaceAll("[abc]", " ").split(" ");
        
        List<String> answer = new ArrayList<>();
        for (String item : arr) {
            if ("".equals(item)) {
                continue;
            }
            answer.add(item);
        }
        
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}