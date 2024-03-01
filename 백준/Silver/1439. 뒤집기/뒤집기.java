import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();

        int zeroCount = 0;
        int oneCount = 0;

        if (S[0] == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }

        char temp;
        for (int i = 1; i < S.length; i++) {
            temp = S[i - 1];

            if (temp != S[i]) {
                if (S[i] == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }

            }
        }
        System.out.println(Math.min(zeroCount, oneCount));
    }
}