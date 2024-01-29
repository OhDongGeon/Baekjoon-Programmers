import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String win = N % 2 == 0 ? "CY" : "SK";
        System.out.println(win);
    }
}