class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        int deliverie = 0;
        int pickup = 0;
        
        for (int i = n - 1; i >= 0  ; i--) {
            
            deliverie -= deliveries[i];
            pickup -= pickups[i];
            
            while (deliverie < 0 || pickup < 0) {
                deliverie += cap;
                pickup += cap;
                
                answer += (i + 1) * 2;
            }
        }
        
        return answer;
    }
}