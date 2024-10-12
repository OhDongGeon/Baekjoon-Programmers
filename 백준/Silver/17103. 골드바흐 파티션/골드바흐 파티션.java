import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] num = new boolean[1_000_001];
        num[0] = true;
        num[1] = true;
        // 에라토스테네스의 체
        for (int i = 2; i * i <= 1_000_000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1_000_000; j += i) {
                    num[j] = true;
                }
            }
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!num[j] && !num[N - j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}