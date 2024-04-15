import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();
        int[] check = new int[26];
        
        for (int i = 0; i < first.length; i++) {
            check[first[i] - 'a']++;
        }
        
        for (int i = 0; i < second.length; i++) {
            check[second[i] - 'a']--;
        }
        
        int answer = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] != 0) {
                answer += Math.abs(check[i]);
            }
        }
        System.out.println(answer);
    }
}