import java.util.*;

public class Main {
	public static void main (String[] args) {
		int[][] apt = new int[15][15];
 
		for(int i = 1; i < apt.length; i++) {
			apt[0][i] = i;
		}
        
        for(int i = 1; i < apt.length; i++) {
            for(int j = 1; j < apt[i].length; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
		    }
		}
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(apt[k][n]);
        }
        sc.close();
    }
}