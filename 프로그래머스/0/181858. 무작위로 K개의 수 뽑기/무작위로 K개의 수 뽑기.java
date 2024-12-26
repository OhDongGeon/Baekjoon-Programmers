import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
            if (list.size() == k) {
                break;
            }
        }
        
        while(list.size() != k) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}