import java.io.*;
import java.util.*;

public class Main {
    
    static int white = 0, blue = 0;
    static int[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        quadrant(0, 0, N);
        
        System.out.println(white);
        System.out.println(blue);
    }
    
    static void quadrant(int h, int w, int size) {
        
        if (color(h, w, size)) {
            if (arr[h][w] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }
        
        int half = size / 2;
        quadrant(h, w + half, half);
        quadrant(h, w, half);
        quadrant(h + half, w, half);
        quadrant(h + half, w + half, half);
    }
    
    static boolean color(int h, int w, int size) {
        for (int i = h; i < h + size; i++) {
            for (int j = w; j < w + size; j++) {
                if (arr[i][j] != arr[h][w]) {
                    return false;
                }
            }            
        }
        return true;
    }
}