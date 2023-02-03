class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int binary_Cnt = 0;
        int zero_Cnt = 0;
        int cnt = 0;
        
        
        while (true) {
            zero_Cnt = s.length();
            
            s = s.replace("0" , "");
            
            zero_Cnt -= s.length();
            
            binary_Cnt = s.length();
            s = Integer.toBinaryString(binary_Cnt);
            
            answer[0] = ++cnt;
            answer[1] += zero_Cnt;
            
            if(s.equals("1")) {
                break;
            }
        }
        
        return answer;
    }
}