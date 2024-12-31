import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int length = 0;
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                length++;
            }
        }
        
        int[][] participate = new int[length][2];
        int idx = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                participate[idx][0] = rank[i];
                participate[idx][1] = i;
                idx++;
            }
        }
        
        Arrays.sort(participate, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        
        return 10000 * participate[0][1] + 100 * participate[1][1] + participate[2][1];
    }
}