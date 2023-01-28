import java.math.BigInteger;

class Solution {
    public BigInteger Factorial(int num) {
        if(num <= 1){
            return BigInteger.valueOf(1);
        }
        BigInteger bigNum = new BigInteger(Integer.toString(num));

        return bigNum.multiply(Factorial(num - 1));
    }


    public BigInteger solution(int balls, int share) {
        BigInteger answer = new BigInteger("0");
        if((1 <= balls && balls <= 30) && (1 <= share && share <= 30)) {
            answer = Factorial(balls).divide(Factorial(balls - share).multiply(Factorial(share)));
        }
        return answer;
    }
}