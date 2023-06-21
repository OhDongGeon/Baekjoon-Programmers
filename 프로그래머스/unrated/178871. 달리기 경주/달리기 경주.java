import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> hm = new HashMap();
        
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        
        for (String call : callings) {
            int rank = hm.get(call);
            String before = players[rank - 1];
            
            players[rank - 1] = call;
            players[rank] = before;
            
            hm.put(call, rank - 1);
            hm.put(before, rank);
        }
        
        return players;
    }
}