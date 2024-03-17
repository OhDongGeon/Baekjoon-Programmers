import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] numberSort = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = numberSort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numberSort);

        int rank = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int number = numberSort[i];
            if (!hm.containsKey(number)) {
                hm.put(number, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(hm.get(numbers[i])).append(" ");
        }
        System.out.println(sb);
    }
}