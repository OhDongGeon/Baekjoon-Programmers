import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            System.out.print(binarySearch(cards, Integer.parseInt(st.nextToken())) + " ");
        }
    }

    static int binarySearch(int[] cards, int number) {

        int left = 0;
        int right = cards.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (cards[mid] < number) {
                left = mid + 1;
            } else if (cards[mid] > number) {
                right = mid - 1;
            } else if (cards[mid] == number) {
                return 1;
            }
        }
        return 0;
    }
}