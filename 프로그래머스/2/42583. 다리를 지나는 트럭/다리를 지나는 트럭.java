import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int answer = 0;
        int sumWeigth = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int truckWeight : truck_weights) {
            while (true) {
                
                if (bridge_length == bridge.size()) {
                    sumWeigth -= bridge.poll();
                } else {
                    
                    int chkWeigth = sumWeigth + truckWeight;
                    
                    if (bridge.isEmpty() || chkWeigth <= weight) {
                        bridge.offer(truckWeight);
                        sumWeigth += truckWeight;
                        answer++;
                        break;
                    } else if (chkWeigth > weight) {
                        bridge.offer(0);
                        answer++;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}