class Solution {
    public int solution(String[] strArr) {
        
        int[] arr = new int[31];
        
        for (String item : strArr) {
            arr[item.length()]++;
        }
        
        int answer = 0;
        for (int i = 1; i < arr.length; i++) {
            answer = Math.max(answer, arr[i]);
        }
    
        return answer;
    }
}