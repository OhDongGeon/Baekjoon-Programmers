import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            map.put(line, map.getOrDefault(line, 0) + 1);
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (map.containsKey(S[i])) {
                answer += map.get(S[i]);
            }
        }
        System.out.println(answer);
    }
}