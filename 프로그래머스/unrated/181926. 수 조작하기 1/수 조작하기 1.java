class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char wsda = control.charAt(i);
            
            if (wsda == 'w') {
                n += 1;
            } else if (wsda == 's') {
                n -= 1;
            } else if (wsda == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        return n;
    }
}