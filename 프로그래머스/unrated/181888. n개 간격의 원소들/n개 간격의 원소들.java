class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length % n == 0 ? length / n : length / n + 1];
        int cnt = 0;
        
        for (int i = 0; i < length; i += n ) {
            answer[cnt++] = num_list[i];
        }
        
        return answer;
    }
}