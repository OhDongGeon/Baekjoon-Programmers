import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aLength = Integer.parseInt(st.nextToken());
        int bLength = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new TreeMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aLength; i++) {
            int element = Integer.parseInt(st.nextToken());
            map.put(element, element);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bLength; i++) {
            map.remove(Integer.parseInt(st.nextToken()));
        }

        System.out.println(map.size());
        StringBuilder sb = new StringBuilder();
        for (Integer item : map.keySet()) {
            sb.append(item).append(" ");
        }
        System.out.println(sb);
    }
}