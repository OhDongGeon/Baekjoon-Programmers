import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String changeS = s.replaceAll("[{|}]", "");
        String[] numbers = changeS.split(",");
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        List<String> arr = new ArrayList<>(map.keySet());
        arr.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int[] answer = new int[map.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = Integer.parseInt(arr.get(i));
        } 

        return answer;
    }
}