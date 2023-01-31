class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int z = i; z <= j; z++) {
            String numz = Integer.toString(z);
            for(int num = 0; num < numz.length(); num++) {
                if(k == Character.getNumericValue(numz.charAt(num))) {
                    answer++;
                }
            } 
        }
        
        return answer;
    }
}