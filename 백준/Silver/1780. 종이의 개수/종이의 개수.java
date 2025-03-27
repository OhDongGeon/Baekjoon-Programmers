import java.io.*;
import java.util.*;

public class Main {
    
    static int[] num = new int[3];
    static int[][] paper;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        paperCut(0, 0, N);
        
        for (int item : num) {
            System.out.println(item);
        }
    }
    
    static void paperCut(int h, int w, int size) {
        if (paperChk(h, w, size)) {
            if (paper[h][w] == -1) {
                num[0]++;
            } else if (paper[h][w] == 0) {
                num[1]++;
            } else {
                num[2]++;
            }
            return;
        }
        
        int newSize = size / 3;
        paperCut(h, w, newSize);
        paperCut(h, w + newSize, newSize);
        paperCut(h, w + newSize * 2, newSize);
        paperCut(h + newSize, w, newSize);
        paperCut(h + newSize, w + newSize, newSize);
        paperCut(h + newSize, w + newSize * 2, newSize);
        paperCut(h + newSize * 2, w, newSize);
        paperCut(h + newSize * 2, w + newSize, newSize);
        paperCut(h + newSize * 2, w + newSize * 2, newSize);
    }
    
    static boolean paperChk(int h, int w, int size) {
        for (int i = h; i < h + size; i++) {
            for (int j = w; j < w + size; j++) {
                if (paper[h][w] != paper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}