import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            xArr[X.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            yArr[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < xArr.length; i++) {
            if (xArr[i] != 0 && yArr[i] != 0) {
                for (int j = 0; j < Math.min(xArr[i], yArr[i]); j++) {
                    sb.append(i);
                }
            } 
        }
        
        sb.reverse();
        
        String answer = "";
        if (sb.length() == 0) {
            answer = "-1";
        } else if (sb.substring(0,1).equals("0")) {
            answer = "0";
        } else {
            answer = sb.toString();
        }
        
        return answer;
    }
}