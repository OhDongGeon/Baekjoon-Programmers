import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, String> pokemon = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            String number = String.valueOf(i);
            
            pokemon.put(number, name);
            pokemon.put(name, number);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            sb.append(pokemon.get(question)).append("\n");
        }
        
        System.out.println(sb);
    }
}