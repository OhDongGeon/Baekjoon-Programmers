class Solution {
    public int solution(int[][] sizes) {
        int size_max = 0;
        int size_min = 0;
        
        for (int i = 0; i < sizes.length; i++)  {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            size_max = Math.max(size_max, max);
            size_min = Math.max(size_min, min);
        }
        
        return size_max * size_min;
    }
}