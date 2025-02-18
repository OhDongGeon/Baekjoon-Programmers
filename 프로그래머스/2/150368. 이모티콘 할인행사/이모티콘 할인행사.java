class Solution {
    private int[] answer = new int[2];
    private int[] discount = {10, 20, 30, 40};
    private int[] emoticons;
    private int[][] users;
    
    public int[] solution(int[][] users, int[] emoticons) {
        int[] arr = new int[emoticons.length];  
        this.emoticons = emoticons;
        this.users = users;
        
        dfs(0, arr);
        
        return answer;
    }
    
    public void dfs(int cnt, int[] arr) {
        
        if (cnt == arr.length) {
            checkCalculate(arr);
            return;
        }
        
        for (int i = 0; i < discount.length; i++) {
            arr[cnt] = discount[i];
            dfs(cnt + 1, arr);
        }
    }
    
    public void checkCalculate(int[] arr) {
        
        int[] result = new int[2];
        
        for (int i = 0; i < users.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < emoticons.length; j++) {
                if (arr[j] >= users[i][0]) {
                    sum += emoticons[j] * (100 - arr[j]) / 100;
                }
            }
            
            if (sum >= users[i][1]) {
                result[0]++;
            } else {
                result[1] += sum;
            }
        }
        
        if (result[0] > answer[0]) {
            answer[0] = result[0];
            answer[1] = result[1];
        }
        
        if (result[0] == answer[0] && result[1] > answer[1]) {
            answer[0] = result[0];
            answer[1] = result[1];
        }
    }
}