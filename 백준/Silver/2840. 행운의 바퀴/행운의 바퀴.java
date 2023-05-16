import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String[] roller = new String[N];

        Arrays.fill(roller, "?");

        int index = 0;
        while (K-- > 0) {
            int rotation = sc.nextInt();
            String alphabet = sc.next();
            int location = (N + index + rotation) % N;

            if (roller[location].equals("?")) {
                roller[location] = alphabet;
            } else if (!roller[location].equals(alphabet)) {
                System.out.println("!");
                return;
            }

            index = location;
        }
        
        int[] cntAlphabet = new int[26];
        for (int i = 0; i < roller.length; i++) {
            if (roller[i].equals("?")) {
                continue;
            }

            int chk = roller[i].charAt(0) - 'A';
            if (cntAlphabet[chk] > 0) {
                System.out.println("!");
                return;
            }
            
            cntAlphabet[chk] ++;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(roller[(index - i + N) % N]);
        }
    }
}