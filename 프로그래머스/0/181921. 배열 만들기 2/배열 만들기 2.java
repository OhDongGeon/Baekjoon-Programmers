import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            boolean chk = true;
            
            for (char item : num.toCharArray()) {
                if (item != '0'&& item != '5') {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                list.add(i);
            }
        }
        
        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}