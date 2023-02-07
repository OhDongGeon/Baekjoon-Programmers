import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList();
        ArrayList<Integer> arr = new ArrayList();
        int cnt = 0;
        int peek = -1;

        for(int i = 0; i < progresses.length; i++) {
            q.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        while(!q.isEmpty()) {
            if(peek == -1) {
                peek = q.peek();
            }

            if(peek < q.peek()) {
                arr.add(cnt);
                peek = -1;
                cnt = 0;
            } else if(q.size() == 1) {
                cnt++;
                q.poll();
                arr.add(cnt);
                cnt = 0;
            } else {
                cnt++;
                q.poll();
            }
        }

        answer = new int[arr.size()];

        for(int item : arr) {
            answer[cnt++] = item;
        }

        return answer;
    }
}