class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++) {
            if(array[i].length() == 0) {
    			answer += " ";
    		} else {
                answer += array[i].substring(0, 1).toUpperCase(); 
                answer += array[i].substring(1, array[i].length()).toLowerCase() + " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	} else {
            return answer.substring(0, answer.length() -1);
        }
    }
}