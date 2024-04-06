import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < number.length(); i++) {
            count[number.charAt(i) - '0']++;
        }

        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            count[6] = count[9] = (int) Math.ceil((count[6] + count[9]) / 2.0);
            answer = Math.max(answer, count[i]);
        }
        System.out.println(answer);
    }
}