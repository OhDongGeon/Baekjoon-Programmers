import java.util.*;

class Plan {
    
    String name;
    int minute;
    int plusMinute;
    
    Plan (String name, int minute, int plusMinute) {
        this.name = name;
        this.minute = minute;
        this.plusMinute = plusMinute;
    }
}

class Solution {
    
    public static int toMinute (String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
    
    public String[] solution(String[][] plans) {
        
        int idx = plans.length;
        List<Plan> arr = new ArrayList<>();
        
        for (int i = 0; i < idx; i++) {
            int minute = toMinute(plans[i][1]);
            
            arr.add(new Plan(plans[i][0], minute, Integer.parseInt(plans[i][2])));
        }
        
        Collections.sort(arr, (o1, o2) -> o1.minute - o2.minute);
        
        Stack<Plan> stack = new Stack<>();
        String[] answer = new String[idx];
        int cnt = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            Plan task = arr.get(i);
            
            if (i == arr.size() - 1) {
                answer[cnt++] = task.name;
                break;
            }
            
            Plan nextTask = arr.get(i + 1);
            
            int allTime =  task.minute + task.plusMinute;
            
            if (nextTask.minute < allTime) {
                task.plusMinute = allTime - nextTask.minute;
                stack.push(task);
                continue;
            }
            
            answer[cnt++] = task.name;
            
            int restMinute = nextTask.minute - allTime;
            while (0 < restMinute && !stack.isEmpty()) {
                Plan stopTask = stack.pop();
                restMinute = restMinute - stopTask.plusMinute;
                
                if (0 <= restMinute) {
                    answer[cnt++] = stopTask.name;
                } else {
                    stack.push(new Plan(stopTask.name, stopTask.minute, restMinute * -1));
                }
            }
        }
        
        while (!stack.isEmpty()) {
             answer[cnt++] = stack.pop().name;
        }

        return answer;
    }
}