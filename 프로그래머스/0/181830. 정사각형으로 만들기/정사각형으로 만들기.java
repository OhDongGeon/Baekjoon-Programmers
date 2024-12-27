class Solution {
    public int[][] solution(int[][] arr) {
        
        int width = arr[0].length;
        int height = arr.length;
        int[][] answer = new int [height][height];
        
        if (height < width) {
            answer = new int[width][width];
        } else if (height > width) {
            answer = new int[height][height];
        }
        
        for (int i = 0; i < height; i ++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}