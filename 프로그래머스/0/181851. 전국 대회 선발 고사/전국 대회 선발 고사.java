import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> rank[o1] - rank[o2]);
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                pq.offer(i);
            }
        }

        return 10000 * pq.poll() + 100 * pq.poll() + pq.poll();
    }
}