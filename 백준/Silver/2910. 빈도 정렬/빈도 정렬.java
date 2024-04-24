import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> seqList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            map.put(number, map.getOrDefault(number, 0) + 1);
            if (!seqList.contains(number)) {
                seqList.add(number);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (map.get(o2).compareTo(map.get(o1)) == 0) {
                return seqList.indexOf(o1) - seqList.indexOf(o2);
            }
            return map.get(o2).compareTo(map.get(o1));
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            for (int j = 0; j < map.get(number); j++) {
                sb.append(number).append(" ");
            }
        }
        System.out.println(sb);
    }
}