class Solution{
    public int solution(String s){
        int answer = 0;
        boolean flag = true;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='-'){
                flag = false;
                continue;
            }
            else if(s.charAt(i)=='+'){
                continue;
            }
            answer = answer * 10 + s.charAt(i)-'0';
        }
    
    return flag?answer:-answer;
    }
}