import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> seq = new Stack<>();
        
        for (int item : ingredient) {
            seq.push(item);
            
            if (seq.size() >= 4) {
                if (seq.get(seq.size() - 4) == 1 &&
                    seq.get(seq.size() - 3) == 2 &&
                    seq.get(seq.size() - 2) == 3 &&
                    seq.get(seq.size() - 1) == 1) {
                    answer++;
                    
                    seq.pop();
					seq.pop();
					seq.pop();
					seq.pop();
                }
            }
        }
        
        
        
        return answer;
    }
}