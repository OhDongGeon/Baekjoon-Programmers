import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] cards = new int[N + 1];
        int[] prices = new int[N + 1];
        int idx = 1;
        for (String card : br.readLine().split(" ")) {
            cards[idx++] = Integer.parseInt(card);
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                prices[i] = Math.max(prices[i], cards[j] + prices[i - j]);
            }
        }
        System.out.println(prices[N]);
    }
}