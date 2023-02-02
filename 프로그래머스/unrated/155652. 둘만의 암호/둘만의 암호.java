class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] str_Skip = skip.split("");
        int alhabet_Cnt = 0;
        
        for(int i = 0; i < str_Skip.length; i++) {
            alphabet = alphabet.replace(str_Skip[i], "");
        }
        
        for(int i = 0; i < s.length(); i++) {
            alhabet_Cnt = (alphabet.indexOf(Character.toString(s.charAt(i))) + index) % alphabet.length();
            answer += alphabet.substring(alhabet_Cnt, alhabet_Cnt + 1);
        }
        
        
        return answer;
    }
}