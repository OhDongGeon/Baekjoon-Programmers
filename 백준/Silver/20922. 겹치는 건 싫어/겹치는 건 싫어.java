import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        int start = 0;
        int end = 0;
        int[] cnt = new int[100001];
        
        while (end < N) {
            while (end < N && cnt[arr[end]] + 1 <= K) {
                cnt[arr[end]]++;
                end++;
            }
            answer = Math.max(answer, end - start);
            cnt[arr[start]]--;
            start++;
        }
        System.out.println(answer);
    }
}