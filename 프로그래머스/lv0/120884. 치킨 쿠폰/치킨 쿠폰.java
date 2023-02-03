class Solution {
    public int solution(int chicken) {
        int answer = chicken / 10;
        int cupon = chicken / 10 + chicken % 10;

        while(true) {
            answer += cupon / 10;
            cupon = cupon / 10 + cupon % 10;
            
            if(cupon < 10) {
                break;
            }
        }
        

        
        return answer;
    }
}