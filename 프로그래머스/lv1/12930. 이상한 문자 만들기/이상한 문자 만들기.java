class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int cnt = 0;
        
        for(String item : array) {
            cnt = item.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? item.toLowerCase() : item.toUpperCase(); 
        }
        return answer;
    }
}