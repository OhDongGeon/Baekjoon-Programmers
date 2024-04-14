class Solution {
    public int solution(String[] babbling) {
        
        String[] overlap = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] pronunciation = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < pronunciation.length; j++) {
                babbling[i] = babbling[i].replace(overlap[j], "1").replace(pronunciation[j], " ");
            }
        }
        
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}