class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0, s));
        answer.append(overwrite_string);
        answer.append(my_string.substring(overwrite_string.length() + s, my_string.length()));
        return answer.toString();
    }
}