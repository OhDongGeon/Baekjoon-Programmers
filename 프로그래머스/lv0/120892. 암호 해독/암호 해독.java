class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] ciphers = cipher.split("");
        
        for(int i = 0; i < ciphers.length; i++) {
            if((i + 1) % code == 0) {
                answer += ciphers[i];
            }
        }
        return answer;
    }
}