import java.util.*;

class Solution {
    int answer = 0;
    boolean[] visited;
    HashSet<Integer> hs = new HashSet();
    
    public void permutetion(String[] number, String[] print, int depth) {
        if(print.length == depth) {
            int num = Integer.parseInt(String.join("", print));
            int cnt = 0;
            
            if(!hs.contains(num)) {
                for(int i = 1; i * i <= num; i++) {
                    if(num % i == 0) {
                        cnt += 2;
                    }
                    if(i * i == num) {
                        cnt++;
                    }
                }
                
                if(cnt == 2) {
                    answer++;
                }
            }
            hs.add(num);
            
            return; 
        }
        
        for(int i = 0; i < number.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                print[depth] = number[i];
                permutetion(number, print, depth + 1);
                visited[i] = false;
            }
        }
    }
    
    
    public int solution(String numbers) {
        String[] number = numbers.split("");
        String[] print;
        visited = new boolean[number.length];
            
        for(int i = 0; i < number.length; i++) {
            permutetion(number, new String[i + 1], 0);
        }
        return answer;
    }
}