class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String num = "";
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            num = t.substring(i, p.length() + i);
            
            if (Long.parseLong(num) <= Long.parseLong(p)) {
                answer++;
            }
            
            num = "";
        }
        
        return answer;
    }
}