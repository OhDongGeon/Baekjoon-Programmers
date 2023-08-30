import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        
        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }
        sc.close();
        
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[i];
                    numArr[i] = temp;
                }
            }
        }
        
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}