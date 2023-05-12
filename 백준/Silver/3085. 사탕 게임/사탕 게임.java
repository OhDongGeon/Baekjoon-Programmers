import java.util.*;

public class Main {
    public static int count (char[][] bomboni) {
        int max = 0;
        for (int i = 0; i < bomboni.length; i++) {
            int cnt = 1;
            for (int j = 1; j < bomboni.length; j++) {
                if (bomboni[i][j] == bomboni[i][j - 1]) {
                    cnt++;
                }
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        for (int i = 0; i < bomboni.length; i++) {
            int cnt = 1;
            for (int j = 1; j < bomboni.length; j++) {
                if (bomboni[j][i] == bomboni[j - 1][i]) {
                    cnt++;
                }
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        return max;
    }

    
    public static void change (char[][] bomboni, int i, int j, int chgI, int chgJ) {
        char temp = bomboni[i][j];
        bomboni[i][j] = bomboni[chgI][chgJ];
        bomboni[chgI][chgJ] = temp;
    }

    
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] bomboni = new char[N][N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String candy = sc.next();
            for (int j = 0; j < candy.length(); j++) {
                bomboni[i][j] = candy.charAt(j);
            }
        }

        for (int i = 0; i < bomboni.length; i++) {
            for (int j = 0; j < bomboni.length; j++) {
                if (j + 1 < bomboni.length) {
                    change(bomboni, i, j, i, j + 1);
                    cnt = Math.max(cnt, count(bomboni));
                    change(bomboni, i, j, i, j + 1);
                }
                if (i + 1 < bomboni.length) {
                    change(bomboni, i, j, i + 1, j);
                    cnt = Math.max(cnt, count(bomboni));
                    change(bomboni, i, j, i + 1, j);
                }
            }
        }
        System.out.println(cnt);
    }
}