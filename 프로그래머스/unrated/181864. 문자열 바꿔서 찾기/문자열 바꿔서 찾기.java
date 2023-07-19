class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String my = "";
        
        for (int i = 0; i < myString.length(); i++) {
            String change = myString.charAt(i) + "";
            if (change.equals("A")) {
                my += "B";
            } else {
                my += "A";
            }
        }
        
        if (my.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}