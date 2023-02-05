import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        ArrayList<String> arr_A = new ArrayList<>(Arrays.asList(A.split("")));
        
        
        for(int i = 0; i < arr_A.size(); i++) {
            Collections.rotate(arr_A, i);
            if(String.join("", arr_A).equals(B)) {
                answer = i;
                break;
            } 
            
            Collections.rotate(arr_A, -i);
            if(String.join("", arr_A).equals(B)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}