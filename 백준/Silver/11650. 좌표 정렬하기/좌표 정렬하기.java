import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nArr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            nArr[i][0] = sc.nextInt(); 
            nArr[i][1] = sc.nextInt(); 
        }
        
        Arrays.sort(nArr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        
        for (int i = 0; i < nArr.length; i++) {
            System.out.println(nArr[i][0] + " " + nArr[i][1]);
        }
    }
}