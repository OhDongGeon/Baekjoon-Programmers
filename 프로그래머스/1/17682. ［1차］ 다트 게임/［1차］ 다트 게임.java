class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char dart = dartResult.charAt(i);
            
            if (Character.isDigit(dart)) {
                idx++;
                if (dart == '1' && dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++;
                } else {
                    score[idx] = dart - '0';
                }
            }
            
            switch (dart) {
                case 'D':
                    score[idx] *= score[idx];
                    break;
                case 'T':
                    score[idx] *= score[idx] * score[idx];
                    break;
                case '*':
                    score[idx] *= 2;
                    if (idx != 0) {
                        score[idx - 1] *= 2;
                    }
                    break;
                case '#':
                    score[idx] *= -1;
                    break;
            }
        }
        
        return score[0] + score[1] + score[2];
    }
}