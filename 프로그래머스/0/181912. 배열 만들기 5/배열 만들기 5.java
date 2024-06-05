import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            String[] strs = intStrs[i].split("");
            String num = ""; 
                
            for (int j = s; j < s + l; j++) {
                num += strs[j];
            }
            
            int number = Integer.parseInt(num);
            
            if (k < number) {
                arr.add(number);
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}