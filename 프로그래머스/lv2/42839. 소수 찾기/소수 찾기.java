import java.util.*;

class Solution {
    int answer = 0;
    // 방문 했었는지 체크하는 변수
    boolean[] visited;
    // 중복확인을 위한 변수
    HashSet<Integer> hs = new HashSet();
    
    public void permutetion(String[] number, String[] print, int depth) {
        // print의 길이가 깊이의 길이와 같다면 return 예정
        if(print.length == depth) {
            // 
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
        // numbers를 배열로 변환
        String[] number = numbers.split("");
        // number의 길이로 설정
        visited = new boolean[number.length];
        
        // 1자리 수 부터 number의 길이 만큼 재귀
        for(int i = 0; i < number.length; i++) {
            // new String[i + 1]은 한자리 부터 시작
            permutetion(number, new String[i + 1], 0);
        }
        return answer;
    }
}