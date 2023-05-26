class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int length = num_list.length;
        
        if (length < 11) { 
            for (int i = 0; i < length; i++) {
                answer *= num_list[i];
            }
        } else {
            answer = 0;
            for (int i = 0; i < length; i++) {
                answer += num_list[i];
            }
        }
        return answer;
    }
}