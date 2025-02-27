import java.io.*;
import java.util.*;

public class Main {
    
    static int minCard;
    static int idx;
    static int[] number;
    static Set<Integer> answer = new HashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        number = new int[4];
        idx = number.length;
        for (int i = 0; i < idx; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        
        minCard = getMinCard();
        getCount(0);
        
        System.out.println(answer.size());
    }
    
    static int getMinCard() {
        int min = 9999;
        for (int i = 0; i < idx; i++) {
            StringBuilder findNum = new StringBuilder();
            for (int j = 0; j < idx; j++) {
                findNum.append(number[(i + j) % idx]);
            }
            min = Math.min(min, Integer.parseInt(findNum.toString()));
        }
        
        return min;
    }
    
    static void getCount(int count) {
        
        if (count >= idx) {
            int mixNum = getMinCard();
            if (mixNum <= minCard) {
                answer.add(mixNum);
            }
            return;
        }
        
        for (int i = 1; i <= 9; i++) {
            number[count] = i;
            getCount(count + 1);
        }
    }
}