class Solution {
    public int[] solution(int[] sequence, int k) {
        
        int[] answer = new int[2];
        int sum = 0;
        int first = 0;
        int second = 0;
        int length = sequence.length;
        int pre = Integer.MAX_VALUE;
        
        while (second != length) {
            if (sum > k || first == length) {
                sum -= sequence[second++];
            } else {
                sum += sequence[first++];
            }
            
            if (sum == k) {    
                if (pre > first - second) {
                    answer[0] = second;
                    answer[1] = first - 1;
                    pre = first - second;
                }
            }
        }
        
        return answer;
    }
}