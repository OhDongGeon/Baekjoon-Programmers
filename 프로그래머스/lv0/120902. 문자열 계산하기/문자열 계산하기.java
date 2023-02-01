class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        String[] str = my_string.replace(" ", "").split("");
        
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("-") || str[i].equals("+")) {
                if(!num.equals("")) {
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
            
            num += str[i];
            
            if(i == str.length - 1) {
                answer += Integer.parseInt(num);
            }
        }
        
        return answer;
    }
}