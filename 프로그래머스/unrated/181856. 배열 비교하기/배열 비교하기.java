class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        
        if (arr1Length < arr2Length) {
            answer = -1;
        } else if (arr1Length > arr2Length) {
            answer = 1;
        } else {
            int arr1Sum = 0;
            int arr2Sum = 0;
            
            for (int i = 0; i < arr1Length; i++) {
                arr1Sum += arr1[i];
                arr2Sum += arr2[i];
            }
            
            if (arr1Sum < arr2Sum) {
                answer = -1;
            } else if (arr1Sum > arr2Sum) {
                answer = 1;
            } 
        }
        
        return answer;
    }
}