import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        // 시간 초과
        // for (int i = 0; i < numbers.length; i++) {
        //     for (int j = i + 1; j < numbers.length; j++) {
        //         if (numbers[i] < numbers[j]) {
        //             answer[i] = numbers[j];
        //             break;
        //         }
        //     }
        //     if (answer[i] == 0) {
        //         answer[i] = -1;
        //     }
        // }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() <= numbers[i]) {
                    stack.pop();
                } else {
                    answer[i] = stack.peek();
                    break;
                }
            }   
            
            if (stack.isEmpty()) {
                answer[i] = -1;
            }
            
            stack.push(numbers[i]);
        }
        
        return answer;
    }
}