import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int idx = 0;
        int len = 1000000;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == k) {
                answer[0] = i;
                answer[1] = i;
                break;
            }

            q.add(sequence[i]);
            sum += sequence[i];

            if (sum == k) {
                answer[0] = idx;
                answer[1] = i;
                len = i - idx;
            } else if (sum > k) {
                int tmp = 0;
                while (sum > k) {
                    tmp = q.poll();
                    sum -= tmp;
                    idx++;

                    if (sum == k && i - idx < len) {
                        answer[0] = idx;
                        answer[1] = i;
                        len = i - idx;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}