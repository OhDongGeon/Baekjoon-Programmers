class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(c - 1 + i));
        }
        
        return answer.toString();
    }
}