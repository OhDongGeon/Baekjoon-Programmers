import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        sc.close();
        
        System.out.println((A + B) % C);
        System.out.println((A % C + B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C * B % C) % C);
    }
}