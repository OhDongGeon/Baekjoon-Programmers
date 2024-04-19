import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        int[] answer = new int[P];
        
        for (int i = 0; i < P; i++) {
        	List<String> students = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
            
            for (int j = 2; j < students.size(); j++) {
                int standard = Integer.parseInt(students.get(j));
                
                for (int k = 1; k < j; k++) {
                    int front = Integer.parseInt(students.get(k));
                    
                    if (standard < front) {
                        answer[i] += j - k;
                        students.remove(j);
                        students.add(k, String.valueOf(standard));
                        break;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < P; i++) {
            sb.append(i + 1).append(" ").append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }
}