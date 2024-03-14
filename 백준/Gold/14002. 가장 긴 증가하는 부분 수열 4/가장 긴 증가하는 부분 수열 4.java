import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int[] ASize = new int[N];
        String[] answerA = new String[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            ASize[i] = 1;
            answerA[i] = String.valueOf(A[i]);
            
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && ASize[i] < ASize[j] + 1) {
                    ASize[i] = ASize[j] + 1;
                    answerA[i] = answerA[j] + " " + A[i];
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
	        if (max < ASize[i]) {
		        max = ASize[i];
		        index = i;
	        }
        }
        System.out.println(max);
        System.out.println(answerA[index]);
    }
}