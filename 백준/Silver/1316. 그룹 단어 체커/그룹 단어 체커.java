import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean chk = true;
            Map<Character, Integer> map = new HashMap<>();
            
            for (int j = 0; j < word.length(); j++) {
                char alphabet = word.charAt(j);
                
                if (map.containsKey(alphabet)) {
                    int idx = map.get(alphabet);
                    
                    if (j - idx != 1) {
                        chk = false;
                        break;
                    }
                }
                map.put(alphabet, j);
            }
            if (chk) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}