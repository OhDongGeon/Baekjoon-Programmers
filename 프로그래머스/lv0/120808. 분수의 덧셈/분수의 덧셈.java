class Solution {
    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        int gcd = gcd(numer1 * (lcm / denom1) + numer2 * (lcm / denom2), lcm);
        
        answer[0] = (numer1 * (lcm / denom1) + numer2 * (lcm / denom2)) / gcd;
        answer[1] = lcm / gcd;
        
        return answer;
    }
}