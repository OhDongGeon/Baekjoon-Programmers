import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] giveup1 = {1,2,3,4,5};
        int[] giveup2 = {2,1,2,3,2,4,2,5};
        int[] giveup3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        int max = 0;
        ArrayList<Integer> win = new ArrayList();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == giveup1[i % giveup1.length]) {
                cnt[0]++;
            } 
            if(answers[i] == giveup2[i % giveup2.length]) {
                cnt[1]++;
            } 
            if(answers[i] == giveup3[i % giveup3.length]) {
                cnt[2]++;
            }
        }

        max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        for(int i = 0; i < cnt.length; i++) {
            if(max == cnt[i]) {
                win.add(i + 1);
            }
        }
        
        answer = new int[win.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = win.get(i);
        }
        
        
        return answer;
    }
}