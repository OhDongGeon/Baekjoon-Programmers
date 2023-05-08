import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        String sum = "";
        
        while (N > 0) {
            int rest = N % B;
            if (rest < 10) {
                sum += rest;
            } else {
                sum += Character.toString('A' + rest - 10);
            }
            N /= B;
        }
        
        StringBuffer sb = new StringBuffer(sum);
        System.out.println(sb.reverse().toString());
    }
}