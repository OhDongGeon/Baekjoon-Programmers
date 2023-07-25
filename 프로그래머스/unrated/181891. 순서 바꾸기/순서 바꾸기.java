class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        
        if (length - 1 < n) {
            return num_list;
        }
        
        int[] answer = new int[length];
        int cnt = 0;
        
        while (cnt < length) {
            answer[cnt++] = num_list[n++];
            
            if (length <= n) {
                n = 0;
            }
        }
        
        return answer;
    }
}