class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        if(1 <= emergency.length && emergency.length <= 10) {
            for(int i = 0; i < emergency.length; i++) {
                if(1 <= emergency[i] && emergency[i] <= 100 ) {
                    for(int j = 0; j < emergency.length; j++) {
                        if(emergency[i] >= emergency[j]) {
                            answer[j]++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}