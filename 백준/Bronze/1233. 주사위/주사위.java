import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();
        sc.close();
        int[] dice = new int[81];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    dice[i + j + k]++;
                }
            }
        }

        int count = 0;
        for (int i = 1; i < dice.length; i++) {
            if (dice[i - 1] < dice[i]) {
                count = i;
            }
        }
        System.out.println(count);
    }
}