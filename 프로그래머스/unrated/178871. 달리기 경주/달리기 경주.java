import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < players.length; i ++) {
            hm.put(players[i], i);
        }
        
        for (String callName : callings) {
            int callRank = hm.get(callName);
            String beforeName = players[callRank - 1];
            
            players[callRank] = beforeName;
            players[callRank - 1] = callName;
            
            hm.put(beforeName, callRank);
            hm.put(callName, callRank - 1);
        }
        
        return players;
    }
}