import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (map.get(o2).compareTo(map.get(o1)) == 0) {
                return o1.compareTo(o2);
            }
            return map.get(o2).compareTo(map.get(o1));
        });
        System.out.println(list.get(0));
    }
}