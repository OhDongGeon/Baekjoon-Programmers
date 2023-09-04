import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> list = new HashMap<>();
        Map<String, Integer> cost = new HashMap<>();
        
        for (int i = 0; i < records.length; i++) {
            String[] car = records[i].split(" ");
            String[] minute = car[0].split(":");
            int time = 0;
            time += Integer.parseInt(minute[0]) * 60;
            time += Integer.parseInt(minute[1]);
            
            
            // int center = car[0].indexOf(":");
            // int hour = Integer.parseInt(car[0].substring(0, center)) * 60;
            // int minute = Integer.parseInt(car[0].substring(center + 1, car[0].length()));
            // int time = hour + minute;   // 시간
            
            String carNum = car[1];     // 차량번호
            String isInOut = car[2];    // 내역
            
            
            if (isInOut.equals("IN")) {
                list.put(carNum, time);
            } else {
                if (!list.containsKey(carNum)) {
                    cost.put(carNum, time);
                } else {
                    cost.put(carNum, cost.getOrDefault(carNum, 0) + (time - list.get(carNum)));
                    list.remove(carNum);
                }
            }
        }
        
        if (!list.isEmpty()) {
            
            for (String item : list.keySet()) {
                int day = 23 * 60 + 59;
                cost.put(item, cost.getOrDefault(item, 0) + (day - list.get(item)));
            }
        }

        int basicsMinute = fees[0];
        int basicsfees = fees[1];
        int unitMinute = fees[2];
        int unitfees = fees[3];
        
        int[] answer = new int[cost.size()];
        List<String> carNums = new ArrayList<>(); 
        
        for (String item : cost.keySet()) {
            int priceMinute = cost.get(item);
            carNums.add(item);
            
            if (basicsMinute > priceMinute) {
                cost.put(item, basicsfees);
            } else {
                priceMinute -= basicsMinute;
                
                // priceMinute = priceMinute % unitMinute == 0 ? 
                //     priceMinute / unitMinute : priceMinute / unitMinute + 1;
                
                cost.put(item,  basicsfees + (int)Math.ceil(priceMinute / (double)unitMinute) * unitfees);
            }
        }
        
        Collections.sort(carNums);
        
        for (int i = 0; i < cost.size(); i++) {
            answer[i] = cost.get(carNums.get(i));
        }

        
        return answer;
    }
}