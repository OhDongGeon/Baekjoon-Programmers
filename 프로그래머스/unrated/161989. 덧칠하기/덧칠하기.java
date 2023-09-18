class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        
        for (int i = 0; i < section.length; i++) {
            paint[section[i] - 1] = true;
        }
        
        for (int i = 0; i < paint.length; i++) {
            
            if (paint[i]) {
                answer++;
                
                for (int j = 0; j < m; j++) {
                    paint[i + j] = false;
                    if (paint.length - 1 <= i + j) {
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}