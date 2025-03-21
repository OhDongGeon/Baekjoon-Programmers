import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int[] arr = new int[S + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());    
        }
        
        int H = Integer.parseInt(br.readLine());
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
                                     
            if (g == 1) {
                for (int j = num; j < arr.length; j = j + num) {
                    arr[j] = arr[j] == 0 ? 1 : 0;
                }
            } else {
                arr[num] = arr[num] == 0 ? 1 : 0;
                
                int cnt = 1;
                while ((num - cnt) > 0 && (num + cnt) < arr.length) {
                    if (arr[num - cnt] == arr[num + cnt]) {
                        arr[num - cnt] = arr[num - cnt] == 0 ? 1 : 0;
                        arr[num + cnt] = arr[num + cnt] == 0 ? 1 : 0;
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}