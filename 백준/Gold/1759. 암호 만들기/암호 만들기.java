import java.util.*;
import java.io.*;

public class Main {
    static int L, C;
    static String[] passwordList, password;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        passwordList = new String[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            passwordList[i] = st.nextToken();
        }
        
        Arrays.sort(passwordList);
        password = new String[L];
        visited = new boolean[C];
        dfs(0, 0, 0, 0);
        
        System.out.println(sb);
    }
    
    static void dfs(int start, int cnt, int vowel, int consonant) {
        
        if (cnt == L) {
            if(vowel >= 1 && consonant >= 2) {
                for (int i = 0; i < L; i++) {
                    sb.append(password[i]);
                }
                sb.append("\n");
            }
            return;
        }
        
        for (int i = start; i < C; i++) {
            if (!visited[i]) {
                visited[i] = true;
                password[cnt] = passwordList[i];
                if (passwordList[i].equals("a") || passwordList[i].equals("e") || 
                    passwordList[i].equals("i") || passwordList[i].equals("o") || 
                    passwordList[i].equals("u")) {
                    dfs(i, cnt + 1, vowel + 1, consonant);
                } else {
                    dfs(i, cnt + 1, vowel, consonant + 1);
                }
                visited[i] = false;
            }
        }
    }
}