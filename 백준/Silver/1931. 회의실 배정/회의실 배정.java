import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] meeting = new int[N][2];
        
        for (int i = 0; i < meeting.length; i++) {
            meeting[i][0] = sc.nextInt();
            meeting[i][1] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(meeting, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        
        int answer = 0;
        int end = 0;
        for (int i = 0; i < meeting.length; i++) {
            if (end <= meeting[i][0]) {
                end = meeting[i][1];
                answer++;
            }
        }
        System.out.print(answer);
    }
}