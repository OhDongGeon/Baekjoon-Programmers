import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        ArrayList<Integer> array = new ArrayList();
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                array.add(arr[i]);
            }
        }
        
        if(array.size() == 0) {
            array.add(-1);
        }
        
        answer = new int[array.size()];
        
        for(int item : array) {
            answer[cnt] = item;
            cnt++;
        }
        
        // answer = array.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}