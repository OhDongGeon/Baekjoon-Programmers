class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] my = my_string.toCharArray();
        
        for (int i = 0; i < my.length; i++) {
            if (Character.isUpperCase(my[i])) {
                answer[my[i] - 'A']++;
            } else {
                answer[my[i] - 'a' + 26]++;
            }
        }
        return answer;
    }
}