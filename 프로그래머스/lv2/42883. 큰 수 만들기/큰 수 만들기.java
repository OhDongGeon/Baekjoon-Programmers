class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        int max = 0;
        
        for (int i = 0; i < number.length() - k; i++) {
            max = 0;
            
            for (int j = index; j < i + k + 1; j++) {
                int num = number.charAt(j) - '0';
                
                if (max < num) {
                    max = num;
                    index = j + 1;
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }
}