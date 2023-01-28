class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] array = letter.split(" ");
        String[] morse = {
                ".-",   "-...", "-.-.", "-..",  ".",    "..-.",
                "--.",  "....", "..",   ".---", "-.-",  ".-..",
                "--",   "-.",   "---",  ".--.", "--.-", ".-.",
                "...",  "-",    "..-",  "...-", ".--",  "-..-",
                "-.--", "--.."};
        
        
        if(1 <= letter.length() && letter.length() <= 1000) {
            
            
            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < morse.length; j++) {
                    if(array[i].equals(morse[j])) {
                        answer += (char)(j + 'a');
                        break;
                    }
                }
            }
        }

        
        
        return answer;
    }
}