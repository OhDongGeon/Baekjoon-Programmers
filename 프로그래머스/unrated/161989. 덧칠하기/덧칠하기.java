class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paint = section[0];
        
        for (int i = 0; i < section.length; i++) {
            if (paint + m - 1 < section[i]) {
                paint = section[i];
                answer++;
            }
        }
        
        return answer;
    }
}