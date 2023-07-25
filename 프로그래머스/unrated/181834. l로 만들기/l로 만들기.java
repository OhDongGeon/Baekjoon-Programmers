class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char word = myString.charAt(i);
            
            if (word < 'l')  {
                answer.append("l");
            } else {
                answer.append(word);
            }
        }
        
        return answer.toString();
    }
}