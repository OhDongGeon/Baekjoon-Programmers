import java.util.*;

public class Main {
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         String[] question = sc.next().split("-");
         sc.close();
         int answer = 0;
         
         for (int i = 0; i < question.length; i++) {
             String[] plus = question[i].split("\\+");
             int sum = 0;
             
             for (int j = 0; j < plus.length; j++) {
                 sum += Integer.parseInt(plus[j]);
             }
             
             if (i == 0) {
                 answer += sum;
             } else {
                 answer -= sum;
             }
         }
         System.out.print(answer);
     }
} 