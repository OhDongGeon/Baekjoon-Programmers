import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int gcd = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            
            if (i > 0) {
                gcd = gcd(arr[i] - arr[i - 1], gcd);
            }
        }
        System.out.println((arr[N - 1] - arr[0]) / gcd - arr.length + 1);
    }
    
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}