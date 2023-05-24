import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] number = new int[num];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(number);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < number.length; i++) {
            bw.write(number[i] + "\n");
        }
        bw.flush();
    }
}