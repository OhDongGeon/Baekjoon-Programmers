import java.io.*;

public class Main {
    
    private static final int MOD = 9901;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[3][N];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[2][0] = 1;
        
        for (int i = 1; i < N; i++) {
            arr[0][i] = (arr[0][i - 1] + arr[1][i - 1] + arr[2][i - 1]) % MOD;
            arr[1][i] = (arr[0][i - 1] + arr[2][i - 1]) % MOD;
            arr[2][i] = (arr[0][i - 1] + arr[1][i - 1]) % MOD;
        }
        System.out.println((arr[0][N - 1] + arr[1][N - 1] + arr[2][N - 1]) % MOD);
    } 
}