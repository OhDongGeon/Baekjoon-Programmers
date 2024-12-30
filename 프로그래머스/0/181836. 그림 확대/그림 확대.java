class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < picture[i].length(); j++) {
                String each = String.valueOf(picture[i].charAt(j));
                sb.append(each.repeat(k));
            }
            
            for (int j = 0; j < k; j++) {
                answer[idx] = sb.toString();
                idx++;
            }
        }
        return answer;
    }
}