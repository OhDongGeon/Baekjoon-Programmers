import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int i = 0;
        ArrayList<Integer> arr = new ArrayList();
        
        for(int item : numlist) {
            arr.add(item);
        }
        
        arr.sort((a, b) -> {
            int abs_A = Math.abs(a - n);
            int abs_B = Math.abs(b - n);
            if (abs_A != abs_B) {
                return abs_A - abs_B;
            } else {
                return b - a;
            }
        });
        
        for(int item : arr) {
            answer[i++] = item;
        }
        
        
        
        
//         int answer_idx = 0;
//         int value = Integer.MAX_VALUE;
//         int idx = 0;
//         int pre = 1;
//         int next = 1;
        
        
//         Arrays.sort(numlist);
        
//         for(int i = 0; i < numlist.length; i++) {
//             if((Math.abs(value - n) > Math.abs(numlist[i] - n))) {
//                 value = numlist[i];
//                 idx = i;
//             }
//         }
        
//         answer[0] = numlist[idx];
        
        
//         while(answer_idx < numlist.length - 1) {
//             answer_idx++;
            
            
            
//             if(idx - pre < 0) {
//                 answer[answer_idx] = numlist[idx + next];
//                 next++;
//                 continue;
//             } else if(idx + next > numlist.length - 1) {
//                 answer[answer_idx] = numlist[idx - pre];
//                 pre++;
//                 continue;
//             }
            
            
//             if(Math.abs(numlist[idx - pre] - n) == (Math.abs(numlist[idx + next] - n))) {
//                 answer[answer_idx] = numlist[idx + next];
//                 next++;
//             } else if(Math.abs(numlist[idx - pre] - n) > (Math.abs(numlist[idx + next] - n))) {
//                 answer[answer_idx] = numlist[idx + next];
//                 next++;
//             } else {
//                 answer[answer_idx] = numlist[idx - pre];
//                 pre++;
//             }
//         }
        
        return answer;
    }
}