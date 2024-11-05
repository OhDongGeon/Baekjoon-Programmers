import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        int[] cnt = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[i] = 1;
            for(int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    cnt[i] = Math.max(cnt[i], cnt[j] + 1);
                }
            }
            answer = Math.max(answer, cnt[i]);
        }
        System.out.println(answer);
    }
}