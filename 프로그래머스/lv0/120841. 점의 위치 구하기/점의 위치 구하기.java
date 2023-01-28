class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot.length == 2) {
            for(int i = 0; i < dot.length; i++) {
                if((-500 > dot[i] && dot[i] > 500) && dot[i] == 0) {
                    return answer;
                }
            }
            
            if(dot[0] > 0 && dot[1] > 0) {
                answer = 1;
            } else if (dot[0] < 0 && dot[1] > 0) { 
                answer = 2;
            } else if (dot[0] < 0 && dot[1] < 0) {
                answer = 3;
            } else if (dot[0] > 0 && dot[1] < 0) {
                answer = 4;
            }
        }
        
        return answer;
    }
}