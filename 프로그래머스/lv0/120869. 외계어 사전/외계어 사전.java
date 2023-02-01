class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                if(!dic[i].contains(spell[j])) {
                    answer = 2;
                    break;
                }
                answer = 1;
            }
            if(answer == 1) {
                break;
            }
        }
        return answer;
    }
}