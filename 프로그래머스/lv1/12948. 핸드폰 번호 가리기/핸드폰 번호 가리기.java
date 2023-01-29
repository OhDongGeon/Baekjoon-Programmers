class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        
        for(int i = 0; i < num.length - 4; i++) {
            num[i] = "*";
        }
        answer = String.join("", num);
        
        
        return answer;
    }
}