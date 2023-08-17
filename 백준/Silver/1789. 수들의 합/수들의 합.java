import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();
        long sum = 0;
        int num = 0;
        
        while (sum < s) {
            num++;
            sum += num;
        }
        
        if (sum == s) {
            System.out.print(num);  
        } else {
            System.out.print(num - 1);   
        }
    } 
}