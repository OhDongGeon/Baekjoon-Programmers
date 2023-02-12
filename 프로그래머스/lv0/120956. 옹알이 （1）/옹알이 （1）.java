class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "0").replace("ye", "0")
                         .replace("woo", "0").replace("ma", "0").replace("0", "");
            if(babbling[i].equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}