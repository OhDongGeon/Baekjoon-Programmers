import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for(int item : scoville) {
            pq.offer(item);
        }
        
        while(pq.peek() < K) {
            if(pq.size() >= 2) {
                pq.offer(pq.poll() + (pq.poll() * 2));
                answer++;
            } else {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}