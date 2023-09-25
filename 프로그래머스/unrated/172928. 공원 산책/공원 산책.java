class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] ewns = routes[i].split(" ");
            String location = ewns[0];
            int move = Integer.parseInt(ewns[1]);
            int x = answer[1];
            int y = answer[0];
            
            for (int j = 0; j < move; j++) {
                if (location.equals("E")) {
                    x++;
                } else if (location.equals("W")) {
                    x--;
                } else if (location.equals("N")) {
                    y--;
                } else {
                    y++;
                }
                
                if (x >= 0 && x < park[0].length() && y >= 0 && y < park.length) {
                    if (park[y].charAt(x) == 'X') {
                        break;
                    }
                    
                    if (j == move - 1) {
                        answer[0] = y;
                        answer[1] = x;
                    }
                }
            }
        }
        
        return answer;
    }
}