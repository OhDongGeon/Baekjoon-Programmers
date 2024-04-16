import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine().toLowerCase();
        int[] check = new int[26];
        int max = 0;
        int checkNum = 0;
        
        for (int i = 0; i < alphabet.length(); i++) {
            int number = alphabet.charAt(i) - 'a';
            check[number]++;
            
            if (checkNum < check[number]) {
            	checkNum = check[number];
                max = number;
            }
        }
        char answer = '.';
        for (int i = 0; i < check.length; i++) {
            if (i != max && check[i] == check[max] ) {
                answer = '?';
                break;
            }
        }
        System.out.println(answer == '?' ? answer : (char) (max + 'A'));
    }
}