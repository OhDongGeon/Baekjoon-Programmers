import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int len = arr[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean first = true;
            char firstArr = arr[0].charAt(i);

            for (int j = 1; j < N; j++) {
                if (firstArr != arr[j].charAt(i)) {
                    first = false;
                }
            }
            if (first) {
                sb.append(firstArr);
            } else {
                sb.append("?");
            }
        }
        System.out.print(sb);
    }
}