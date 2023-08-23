import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone1 = sc.nextLine();
        String phone2 = sc.nextLine();
        sc.close();
        StringBuilder sb1 = new StringBuilder();
        
        for (int i = 0; i < phone1.length(); i++) {
            sb1.append(phone1.charAt(i) - '0');
            sb1.append(phone2.charAt(i) - '0');
        } 
        
        while (sb1.length() > 2) {
            StringBuilder sb2 = new StringBuilder();
            
            for (int i = 1; i < sb1.length(); i++) {
                int sum = sb1.charAt(i - 1) - '0' + sb1.charAt(i) - '0';
                sb2.append(sum % 10);
            } 
            
            sb1 = sb2;
        }
        System.out.print(sb1);
    }
}