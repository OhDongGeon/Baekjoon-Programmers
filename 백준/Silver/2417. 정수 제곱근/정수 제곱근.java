import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(binarySearch(Long.parseLong(br.readLine())));
    }

    static long binarySearch (long n) {

        long left = 0;
        long right = n;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (Math.pow(mid, 2) >= n) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}