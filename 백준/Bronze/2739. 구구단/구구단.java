import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        sc.close();
        
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}