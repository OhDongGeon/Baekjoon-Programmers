class Solution {
    public String solution(String rsp) {
        String answer = "";
        if(0 < rsp.length() && rsp.length() <= 100) {
            for(String item : rsp.split("")) {
                if(item.equals("2")) {
                    answer += "0";
                } else if(item.equals("0")) {
                    answer += "5";
                } else {
                    answer += "2";
                }
            }
        }
        return answer;
    }
}