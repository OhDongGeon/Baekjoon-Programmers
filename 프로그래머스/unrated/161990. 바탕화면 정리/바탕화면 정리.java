import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<String> arr = new ArrayList<>();
        
        for (String item : wallpaper) {
            arr.add(item);
        }
        
        int firstRow = Integer.MAX_VALUE;
        int firstCol = Integer.MAX_VALUE;
        int lastRow = 0;
        int lastCol = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("#")) {
                firstRow = Math.min(firstRow, i);
                firstCol = Math.min(firstCol, arr.get(i).indexOf("#"));
                lastRow = Math.max(lastRow, i + 1);
                lastCol = Math.max(lastCol, arr.get(i).lastIndexOf("#") + 1);
            }
        }
        
        int[] answer = {firstRow, firstCol, lastRow, lastCol};
        return answer;
    }
}