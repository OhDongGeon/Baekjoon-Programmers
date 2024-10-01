import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int question = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < question; i++) {
            int cnt = Integer.parseInt(br.readLine());
            int bCnt = 0;
            int wCnt = 0;
            String first = br.readLine();
            String second = br.readLine();
            
            
            for (int j = 0; j < cnt; j++) {
                if (first.charAt(j) != second.charAt(j)) {
                    if (first.charAt(j) == 'W') {
                        wCnt++;
                    } else {
                        bCnt++;
                    }
                }
            }
            System.out.println(Math.max(wCnt, bCnt));
        }
    }
}