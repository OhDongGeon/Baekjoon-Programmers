class Solution {
    public String solution(String my_string, int[] indices) {
        
        char[] my = my_string.toCharArray();
        boolean[] check = new boolean[my.length];
        
        for (int i = 0; i < indices.length; i++) {
            check[indices[i]] = true;
        }
        
        String answer = "";
        for (int i = 0; i < my.length; i++) {
            if (check[i]) {
                continue;
            }
            answer += my[i];
        }
        
        return answer;
    }
}