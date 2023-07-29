class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for (boolean item : finished) {
            if (!item) {
                idx++;
            }
        }
        
        String[] answer = new String[idx];
        int cnt = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[cnt++] = todo_list[i];
            }
        }
        
        return answer;
    }
}