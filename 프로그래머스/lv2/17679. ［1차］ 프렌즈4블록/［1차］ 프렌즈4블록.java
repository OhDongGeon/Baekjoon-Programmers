import java.util.*;

class Solution {
    
    private char[][] block;
    private boolean[][] check;
    
    public int solution(int m, int n, String[] board) {
        block = new char[m][n];
        check = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            block[i] = board[i].toCharArray();
        }
        
        int answer = 0;
        while(true) {
            int stop = 0;
            
            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    stop += findBlock(i, j);
                }
            }
            
            if (stop == 0) {
                break;
            }
            
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if (check[i][j]) {
                        answer++;
                        check[i][j] = false;
                        block[i][j] = '-';
                    }
                }
            }
            
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    
                    if (block[i][j] == '-') {
                        for (int k = i - 1; k >= 0; k--) {
                            
                            if (block[k][j] != '-') {
                                block[i][j] = block[k][j];
                                block[k][j] = '-';
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    
    
    
    public int findBlock(int i, int j) {
        
        if (block[i][j] != '-' &&
            block[i][j] == block[i][j + 1] &&
            block[i][j] == block[i + 1][j] &&
            block[i][j] == block[i + 1][j + 1]) {
            
            check[i][j] = true;
            check[i][j + 1] = true;
            check[i + 1][j] = true;
            check[i + 1][j + 1] = true;
            
            return 1;
        }
        return 0;
    }
}