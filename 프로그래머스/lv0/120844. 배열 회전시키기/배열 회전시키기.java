import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        ArrayList<Integer> array = new ArrayList();
        
        IntStream.of(numbers).forEach(x -> array.add(x));
        
        if(direction.equals("right")) {
            Collections.rotate(array, 1);
        } else if (direction.equals("left")) {
            Collections.rotate(array, -1);
        }
        
        int cnt = 0;
        for(Integer item : array){
            answer[cnt++] = item;
        }
        
        return answer;
    }
}