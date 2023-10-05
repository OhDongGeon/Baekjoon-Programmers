class Solution {
    public int solution(int[] a) {
        int answer = 1;
        
        int min = a[0];
        for (int i = 1; i < a.length; i++) {           
            if (min > a[i]) {
                min = a[i];
                answer++;
            }
        }
        
        min = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            if (min > a[i]) {
                min = a[i];
                answer++;
            }
        }
        
        return answer;
    }
}