class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Chk = 0;
        int cards2Chk = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (cards1Chk < cards1.length && goal[i].equals(cards1[cards1Chk])) {
                cards1Chk++;
                continue;
            }
            
            if (cards2Chk < cards2.length && goal[i].equals(cards2[cards2Chk])) {
                cards2Chk++;
                continue;
            }
            
            answer = "No";
            break;
        }
        
        return answer;
    }
}