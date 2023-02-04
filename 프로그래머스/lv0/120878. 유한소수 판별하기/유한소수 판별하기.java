class Solution {
    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b , a % b);
    }
    
    public int solution(int a, int b) {
        int answer = 1;
        
        b /= gcd(a, b);
        
        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            }
            else if (b % 5 == 0) {
                b /= 5;
            }
            else {
                return 2;
            }
        }
        
        return answer;
    }
}