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
            String[] move = routes[i].split(" ");
            String EWSN = move[0];
            int distance = Integer.parseInt(move[1]);
            int locationY = answer[0];
            int locationX = answer[1];
            
            for (int j = 0; j < distance; j++) {
                if (EWSN.equals("E")) {
                    locationX++;
                } else if (EWSN.equals("W")) {
                    locationX--;
                } else if (EWSN.equals("S")) {
                    locationY++;
                } else {
                    locationY--;
                }
                
                if (locationX >= 0 && locationX < park[0].length() && locationY >= 0 && locationY < park.length) {
                    if (park[locationY].charAt(locationX) == 'X') {
                        break;
                    }
                    if (j == distance - 1) {
                        answer[0] = locationY;
                        answer[1] = locationX; 
                    } 
                }
            }
        }
        
        return answer;
    }
}