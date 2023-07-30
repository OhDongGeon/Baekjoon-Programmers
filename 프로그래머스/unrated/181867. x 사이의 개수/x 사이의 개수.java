class Solution {
    public int[] solution(String myString) {
        String[] xStandard = myString.split("x", myString.length());
        int[] answer = new int[xStandard.length];
        
        for (int i = 0; i < xStandard.length; i++) {
            answer[i] = xStandard[i].length();
        }
        
        return answer;
    }
}