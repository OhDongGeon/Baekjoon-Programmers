import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] cow1 = new int[26];
        int[] cow2 = new int[26];

        for (int i = 0; i < 52; i++) {

            int cowNum = str.charAt(i) - 'A';

            if (cow1[cowNum] == 0) {
                cow1[cowNum] = i + 1;
            } else {
                cow2[cowNum] = i + 1;
            }
        }

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (cow1[i] < cow1[j] && cow1[j] < cow2[i] && cow2[i] < cow2[j]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}