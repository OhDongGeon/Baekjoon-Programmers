import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;
        for (int i = 6; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}