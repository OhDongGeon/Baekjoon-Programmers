import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        sc.close();
        
        if (dice1 == dice2 && dice2 == dice3 && dice3 == dice1) {
            System.out.print(10000 + dice1 * 1000);
        } else if (dice1 == dice2 || dice1 == dice3) {
            System.out.print(1000 + dice1 * 100);
        } else if (dice2 == dice3) {
            System.out.print(1000 + dice2 * 100);
        } else {
            System.out.print(Math.max(dice1, Math.max(dice2, dice3)) * 100);
        }
    }
}