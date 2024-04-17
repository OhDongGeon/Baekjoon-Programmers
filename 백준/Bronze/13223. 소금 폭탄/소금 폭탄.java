import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] startTime = br.readLine().split(":");
        String[] endTime = br.readLine().split(":");
        int startSecond = 0;
        int endSecond = 0;
        
        for (int i = startTime.length - 1; i >= 0; i--) {
            int start = Integer.parseInt(startTime[i]);
            int end = Integer.parseInt(endTime[i]);
            
            if (i == 2) {
                startSecond += start;
                endSecond += end;
            } else if (i == 1) {
                startSecond += (start * 60);
                endSecond += (end * 60);
            } else {
                startSecond += (start * 3600);
                endSecond += (end * 3600);
                
                if (startSecond >= endSecond) {
                    endSecond += (24 * 3600);
                }
            }
        }
        int minus = endSecond - startSecond;
        
        System.out.printf("%02d:%02d:%02d", minus / 3600, minus % 3600 / 60, minus % 3600 % 60);
    }
}