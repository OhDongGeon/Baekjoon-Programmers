class Solution {
    public String solution(String my_string, int s, int e) {
        
        String[] my = my_string.split("");
        int cnt = 0;
        String answer = "";
        
        for (int i = 0; i < my.length; i++) {
            if (s <= i && i <= e) {
                answer += my[e - cnt]; 
                cnt++;
            } else {
                answer += my[i]; 
            }
        }
        return answer;
    }
}