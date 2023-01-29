class Solution {
    public String solution(int age) {
        String answer = "";
        String num = Integer.toString(age);
        for(int i = 0; i < num.length(); i++) {
            answer += Character.toString(num.charAt(i) - '0' + 'a');
        }
        return answer;
    }
}