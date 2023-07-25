class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            int first = parts[i][0];
            int second = parts[i][1] + 1;
            
            answer.append(my_strings[i].substring(first, second));
        } 
        
        return answer.toString();
    }
}