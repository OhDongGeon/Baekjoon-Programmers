class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder re = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for(int i = 0; i < X.length(); i++) {
            cntX[Character.getNumericValue(X.charAt(i))]++;
        }
        
        for(int i = 0; i < Y.length(); i++) {
            cntY[Character.getNumericValue(Y.charAt(i))]++;
        }
        
        for(int i = 0; i < cntX.length; i++) {
            if(cntX[i] != 0 && cntY[i] != 0) {
                for(int j = 0; j < Math.min(cntX[i], cntY[i]); j++) {
                    re.append(i);
                }
            }
        }
        
        answer = re.reverse().toString();
        
        if(re.length() == 0) {
            answer = "-1";
        } else if(re.substring(0,1).toString().equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}