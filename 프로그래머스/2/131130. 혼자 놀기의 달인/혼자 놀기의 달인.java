// 8 6 3 7 2 5 1 4
// 1     1     1 1
// 8은 4를 찾았음 상자 종료
// 8 6 3 7 2 5 1 4
//   2     2 2
// 6도 찾았던 숫자
// 8 6 3 7 2 5 1 4
// 1 2   1 2 2 1 1

import java.util.*;

class Solution {
    
    int[] cardsCopy;
    boolean[] visited;
    ArrayList<Integer> arr = new ArrayList<>();
    
    public int solution(int[] cards) {
        
        int cardLength = cards.length;
        cardsCopy = cards;
        visited = new boolean[cardLength];
        
        for (int i = 0; i < cardLength; i++) {
            if (!visited[i]) {
                box(cards[i] - 1, 0);
            }
        }
        
        int answer = 0;
        
        if (arr.size() != 1) {
            Collections.sort(arr, Collections.reverseOrder());
            answer = arr.get(0) * arr.get(1);
        }
        
        return answer;
    }
    
    
    public void box (int cardLocation, int cnt) {
        if (visited[cardLocation]) {
            arr.add(cnt);
            return;
        }
        
        visited[cardLocation] = true;
        box(cardsCopy[cardLocation] -1, cnt + 1);
    }
}


