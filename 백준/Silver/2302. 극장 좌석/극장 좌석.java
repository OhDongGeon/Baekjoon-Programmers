import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seat = new int[N + 1];
        seat[0] = 1;
        seat[1] = 1;

        for (int i = 2; i <= N; i++) {
            seat[i] = seat[i - 1] + seat[i - 2];
        }

        int pre = 0;
        int answer = 1;
        int vipCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < vipCount; i++) {
            int vip = Integer.parseInt(br.readLine());
            answer *= seat[vip - pre - 1];
            pre = vip;
        }
        answer *= seat[N - pre];

        System.out.println(answer);
    }
}