import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                arr.add(want[i]);
            }
        }

        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            List<String> chk = new ArrayList<>(arr);

            for (int j = i; j < 10 + i; j++) {
                if (chk.contains(discount[j])) {
                    chk.remove(discount[j]);
                } else {
                    continue;
                }
            }
            answer += chk.size() == 0 ? 1 : 0;
        }
        
        return answer;
    }
}