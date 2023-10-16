import java.util.*;

class Solution {
    
    static int[] answer = {-1};
    static int[] lion;
    static int end;
    static int max = 0;
    
    public int[] solution(int n, int[] info) {
        
        lion = new int[info.length];
        end = n;

        dfs(info, 0);

        return answer;
    }
    
    
    public static void dfs(int[] info, int shoot) {
        
        if (shoot == end) {
            int infoScore = 0;
            int lionScore = 0;

            for (int i = 0; i < info.length; i++) {
                if (info[i] == 0 && lion[i] == 0) {
                    continue;
                } else if (info[i] >= lion[i]) {
                    infoScore += 10 - i;
                } else {
                    lionScore += 10 - i;
                }
            }

            int diff = lionScore - infoScore;
            if (0 < diff && max <= diff) {
                max = diff;
                answer = Arrays.copyOf(lion, lion.length);
            }

            return;
        }

        
        for (int i = 0; i < info.length; i++) {
            
            if (info[i] < lion[i]) {
                return;
            }
            
            lion[i]++;
            dfs(info, shoot + 1);
            lion[i]--;
        }
    }
}