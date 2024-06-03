class Solution {
    public String solution(String my_string, int[] indices) {
        
        String[] my = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            my[indices[i]] = "";
        }

        String answer = "";
        for (int i = 0; i < my.length; i++) {
            answer += my[i];
        }
        return answer;
    }
}