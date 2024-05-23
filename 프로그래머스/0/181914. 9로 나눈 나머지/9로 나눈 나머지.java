import java.math.*;

class Solution {
    public int solution(String number) {
        
        int answer = 0;
        
        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        
        return answer % 9;
        
       	// BigInteger bi = new BigInteger(number);
       	// return bi.mod(new BigInteger("9")).intValue();
    }
}