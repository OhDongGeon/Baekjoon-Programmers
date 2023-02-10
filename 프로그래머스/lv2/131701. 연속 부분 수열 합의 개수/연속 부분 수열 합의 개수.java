import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int sum = 0;
        HashSet<Integer> hs = new HashSet();
        
        
        // elements의 길이 만큼 순회
        for(int i = 0; i < elements.length; i++) {
            sum = 0;
            // elements의 길이 + i 만큼 순회, 맨끝자리에 도달하여 다시 0번으로 돌아와 더해야 하는 경우가 있음
            for(int j = i; j < elements.length + i; j++) {
                // elements의 길이를 넘어 갔을때
                if(elements.length <= j) {
                    sum += elements[j - elements.length];
                } else {
                    // elements의 길이 안에 있을때
                    sum += elements[j];
                }
                // 중복 제거 
                hs.add(sum);
            }
        }
        answer = hs.size();
        return answer;
    }
}