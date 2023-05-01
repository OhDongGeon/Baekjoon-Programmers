import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String longInt = "";
        
        for (int i = 0; i < N / 4; i++) {
            longInt += "long ";
        }
        System.out.print(longInt + "int");
    }
}