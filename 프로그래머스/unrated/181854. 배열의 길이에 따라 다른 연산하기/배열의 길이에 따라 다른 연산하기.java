class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            if (length % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else if (length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        } 
        return answer;
    }
}