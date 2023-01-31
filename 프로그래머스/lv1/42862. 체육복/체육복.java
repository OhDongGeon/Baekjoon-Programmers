class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] chk = new int[n];
        
        for(int i = 0; i < reserve.length; i++) {
            chk[reserve[i] - 1]++;
        }
        
        for(int i = 0; i < lost.length; i++) {
            chk[lost[i] - 1]--;
        }

        for (int i = 0; i < chk.length; i++) {
            if(chk[i] == -1) {
                if(0 <= i - 1 && chk[i - 1] == 1) {
                    chk[i]++;
                    chk[i - 1]--;
                }else if(i + 1 < chk.length && chk[i + 1] == 1) {
                    chk[i]++;
                    chk[i + 1]--;
                }else {
                    answer--;
                }
            }
        }
        return answer;
    }
}