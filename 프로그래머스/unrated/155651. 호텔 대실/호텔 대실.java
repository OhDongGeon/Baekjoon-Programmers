import java.util.*;

class Solution {
    
    public int time (String time, int cnt) {
        String[] times = time.split(":");
        int minute = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
        return cnt == 0 ? minute : minute + 10;
    }
    
    
    public int solution(String[][] book_time) {
        int[][] time = new int[book_time.length][2];
        
        for (int i = 0; i < book_time.length; i++) {
            for (int j = 0; j < book_time[i].length; j++) {
                time[i][j] = time(book_time[i][j], j);
            }
        }
        
        Arrays.sort(time, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } 
            return o1[0] - o2[0];
        });
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < time.length; i++) {
            if (pq.isEmpty()) {
                pq.add(time[i][1]);
                continue;
            }
            
            if (pq.peek() > time[i][0]) {
                pq.add(time[i][1]);
            } else {
                pq.add(time[i][1]);
                pq.remove();
            }
        }
        
        return pq.size();
    }
}