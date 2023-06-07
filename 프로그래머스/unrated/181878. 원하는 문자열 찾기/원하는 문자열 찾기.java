class Solution {
    public int solution(String myString, String pat) {
        int answer = myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
        return answer;
    }
}