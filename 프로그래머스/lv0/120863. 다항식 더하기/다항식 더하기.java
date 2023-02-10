class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.replace(" ", "").split("\\+");
        int sum = 0;
        int sum_x = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                sum_x += Integer.parseInt(arr[i].replace("x", "").equals("") ? "1" : arr[i].replace("x", ""));
            } else {
                sum += Integer.parseInt(arr[i]);
            }
        }

        if(sum_x == 0) {
            answer = sum + "";
        } else if(sum_x == 1 && sum == 0) {
            answer = "x";
        } else if(sum_x == 1 && sum != 0) {
            answer = "x + " + sum;
        } else if(sum == 0) {
            answer = sum_x + "x";
        } else {
            answer = sum_x + "x + " + sum;
        }
        
        return answer;
    }
}