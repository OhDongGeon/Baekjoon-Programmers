import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String character = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < character.length(); i++) {
            char check = character.charAt(i);
            
            if (Character.isUpperCase(check)) {
                sb.append(String.valueOf(check).toLowerCase());
            } else {
                sb.append(String.valueOf(check).toUpperCase());
            }
        }
        System.out.println(sb);
    }
}