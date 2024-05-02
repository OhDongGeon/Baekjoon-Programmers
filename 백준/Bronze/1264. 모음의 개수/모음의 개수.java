import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();

            if (str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            int answer = 0;
            for (int i = 0; i < str.length(); i++) {
                char check = str.charAt(i);
                
                if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}