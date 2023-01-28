import java.util.*;
import java.io.*;

class Solution {
    public static int getDaySum(String date, int dayNum) {
        String[] dateArr = date.split("\\.");
        
        int year = Integer.parseInt(dateArr[0]) * 12 * dayNum;
        int month = Integer.parseInt(dateArr[1]) * dayNum;
        int day = Integer.parseInt(dateArr[2]);
        
        return year + month + day;
    }
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList();
        final int dayNum = 28;
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String item: terms) {
            String[] itemArr = item.split(" ");
            termsMap.put(itemArr[0], Integer.parseInt(itemArr[1]));
        }
        
        int todaySum = getDaySum(today, dayNum);
        for (int i = 0; i < privacies.length; i++) {
            String[] privaciesArr = privacies[i].split(" ");
            
            int validity = getDaySum(privaciesArr[0], dayNum) 
                + (termsMap.get(privaciesArr[1]) * dayNum);
            
            if(validity <= todaySum) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}