import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if (list.contains(city)) {
                answer++;
                list.remove(city);
            } else {
                answer += 5;
                if (list.size() == cacheSize) {
                    list.pollFirst();
                }
            }
            list.add(city);
        }
        return answer;
    }
}