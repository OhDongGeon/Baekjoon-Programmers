import java.util.*;

public class Main {
    public static int nextNum (int i) {
        int sum = i;

        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }


    public static void main(String[] arg) {
        int max = 10000;
        int[] checkNum = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            int copyI = i;

            while (true) {
                int next = nextNum(copyI);

                if (next > max) {
                    break;
                }
                checkNum[next]++;
                copyI = next;
            }
        }

        for (int i = 1; i < checkNum.length; i++) {
            if (checkNum[i] == 0) {
                System.out.println(i);
            }
        }
    }
}