import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max_Key = -1;
        int max = 0;
        HashMap<Integer, Integer> hm = new HashMap();
        
        
        
        for(int item : array) {
            int value = hm.getOrDefault(item, 0) + 1;
            hm.put(item, value);
            
            if(max < value) {
                max = value;
                max_Key = item;
            }
        }
        
        for(int item : hm.keySet()) {
            if(item != max_Key && hm.get(item) == max){
                return -1;
            }          
        }
        
        // for(Map.Entry<Integer, Integer> item : hm.entrySet()) {
        //     if(item.getKey() != max_Key && item.getValue() == max){
        //         return -1;
        //     }
        // }
        
        
        
        return answer = max_Key;
    }
}