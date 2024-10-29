import java.util.*;

class Solution {
    
    HashMap<Long, Long> map = new HashMap<>();
    
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        
        for (int i = 0; i < room_number.length; i++) {
            answer[i] = findRoom(room_number[i]);
        }
        return answer;
    }
    
    private long findRoom(long room) {
        
        if (!map.containsKey(room)) {
            map.put(room, room + 1);
            return room;
        }
        
        long next = findRoom(map.get(room));
        map.put(room, next);
        return next;
    }
}