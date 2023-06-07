class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        
        for (int i = 0; i < myString.length(); i++) {
            String word = myString.charAt(i) + "";
            if (word.equals("a")) {
                word = word.toUpperCase();
            }
            answer += word;
        }
        return answer;
    }
}