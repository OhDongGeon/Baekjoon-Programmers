class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] clothes = new int[n + 1];
        
        for(int item : lost) {
            clothes[item]--;
        }
        for(int item : reserve) {
            clothes[item]++;
        }
        
        for (int i = 1; i < clothes.length; i++) {
            if (clothes[i] == -1) {
                if (clothes[i - 1] == 1) {
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i + 1 < clothes.length && clothes[i + 1] == 1) {
                    clothes[i]++;
                    clothes[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        
        return answer;
    }
}