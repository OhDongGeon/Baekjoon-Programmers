import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] first = st.nextToken().toCharArray();
        char[] second = st.nextToken().toCharArray();
        int answer = 50;
        
        for (int i = 0; i <= (second.length - first.length); i++) {
            int count = 0;
            for (int j = 0; j < first.length; j++) {
                if (first[j] != second[i + j]) {
                    count++;
                }
            }
            answer = Math.min(answer, count);
        }
        System.out.println(answer);
    }
}