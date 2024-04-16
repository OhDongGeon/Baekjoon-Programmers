import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        int answer = 0;
        
        
        while (true) {
        	
            if (first.length() < second.length() || !first.contains(second)) {
                break;
            }
            
            first = first.replaceFirst(second, "1");
            answer++;
        }
        System.out.println(answer);
    }
}