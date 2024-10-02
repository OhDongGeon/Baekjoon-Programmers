import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        char[] king = st.nextToken().toCharArray();
        char[] stone = st.nextToken().toCharArray();;
        int cnt = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < cnt; i++) {
            String cmd = br.readLine();
            char[] next_king = move(king, cmd);
            
            // 8*8 범위 내
            if (isRange(next_king)) {
                if (next_king[0] == stone[0] && next_king[1] == stone[1]) {
                    char[] next_stone = move(stone, cmd);
                    if (isRange(next_stone)) {
                        king = next_king;
                        stone = next_stone;
                    }
                } else {
                    king = next_king;
                }
            }
        }
        System.out.println(king[0] + "" + king[1]);
        System.out.println(stone[0] + "" + stone[1]);
    }
    
    // 범위 체크
    public static boolean isRange(char[] chess) {
        
        if (chess[0] < 'A' || chess[0] > 'H' || chess[1] < '1' || chess[1] > '8') {
            return false;
        }
        
        return true;
    }
    
    // 이동
    public static char[] move(char[] chess, String move) {
        
        char[] copy = chess.clone();
        
        switch (move) {
            case "R":
                copy[0]++;
                break;
            case "L":
                copy[0]--;
                break;
            case "B":
                copy[1]--;
                break;
            case "T":
                copy[1]++;
                break;
            case "RT":
                copy[0]++;
                copy[1]++;
                break;
            case "LT":
                copy[0]--;
                copy[1]++;
                break;
            case "RB":
                copy[0]++;
                copy[1]--;
                break;
            case "LB":
                copy[0]--;
                copy[1]--;
                break;
        }
        return copy;
    } 
}