// import java.math.*;

class Solution {
    public String solution(String a, String b) {
        
        // BigInteger num1 = new BigInteger(a);
        // BigInteger num2 = new BigInteger(b);
        // String answer = num1.add(num2).toString();
    
        StringBuilder answer = new StringBuilder();
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int over = 0;
        
        while (alen >= 0 || blen >= 0 || over > 0) {
            
            int sum = over;
            
            if (alen >= 0) {
                sum += a.charAt(alen--) - '0';
            }
            if (blen >= 0) {
                sum += b.charAt(blen--) - '0';
            }
            
            answer.append(sum % 10);
            over = sum / 10;
        }
        
        return answer.reverse().toString();
    }
}