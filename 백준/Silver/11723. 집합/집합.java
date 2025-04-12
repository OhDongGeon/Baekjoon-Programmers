import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        
        HashSet<Integer> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while (S-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()) {
                case "add" :
                    hs.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove" :
                    hs.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check" :
                    sb.append(hs.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
                    break;
                case "toggle" :
                    int num = Integer.parseInt(st.nextToken());
                    if (hs.contains(num)) {
                        hs.remove(num);
                    } else {
                        hs.add(num);
                    }
                    break;
                case "all" :
                    hs.clear();
                    for (int i = 1; i <= 20; i++) {
                        hs.add(i);
                    }
                    break;
                case "empty" :
                    hs.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}