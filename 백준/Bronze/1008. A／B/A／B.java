import java.util.Scanner;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();
        System.out.print(A/B);
    }
}