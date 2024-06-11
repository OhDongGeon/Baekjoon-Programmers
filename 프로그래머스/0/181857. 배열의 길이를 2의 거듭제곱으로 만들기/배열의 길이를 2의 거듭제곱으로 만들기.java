class Solution {
    public int[] solution(int[] arr) {
        int arrIdx = arr.length;
        int count = 1;
        
        while (count < arrIdx) {
            count *= 2;
        }
        
        int[] answer = new int[count];
        System.arraycopy(arr, 0, answer, 0, arrIdx);
        
        return answer;
    }
}