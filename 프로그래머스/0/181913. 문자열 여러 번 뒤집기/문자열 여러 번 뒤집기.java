class Solution {
    public String solution(String my_string, int[][] queries) {

        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1] + 1;
            
            StringBuilder reverse = new StringBuilder(answer.substring(start, end));
            
            answer.replace(start, end, reverse.reverse().toString());
        }
        return answer.toString();
    }
}