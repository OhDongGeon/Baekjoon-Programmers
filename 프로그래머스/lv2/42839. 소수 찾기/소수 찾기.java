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
            // 순열한 값을 숫자로 변환 예) 011 -> 11
            int num = Integer.parseInt(String.join("", print));
            int cnt = 0;
            
            // HashSet안에 순열한 숫자가 있는지 확인
            if(!hs.contains(num)) {
                // 소수 찾기
                for(int i = 1; i * i <= num; i++) {
                    if(num % i == 0) {
                        cnt += 2;
                    }
                    if(i * i == num) {
                        cnt++;
                    }
                }
                
                // 소수가 1과 본인수를 가지고 있으면 소수 
                if(cnt == 2) {
                    answer++;
                }
            }
            // HashSet 추가
            hs.add(num);
            
            return; 
        }
        
        
        for(int i = 0; i < number.length; i++) {
            // 방문 했었는지 체크
            if(!visited[i]) {
                // 방문 체크
                visited[i] = true;
                // print자리수에 맞게 number 추가
                print[depth] = number[i];
                // 재귀
                permutetion(number, print, depth + 1);
                // 재귀 후 방문 체크 해제
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