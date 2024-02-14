import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
                int friendsLength = friends.length;
        int[][] exchange = new int[friendsLength][friendsLength];
        int[] giftIndex = new int[friendsLength];
        int[] value = new int[friendsLength];
        List<String> arr = Arrays.asList(friends);


        Map<String, Integer> map = new HashMap<>();
        for (String gift : gifts) {
            map.put(gift, map.getOrDefault(gift, 0) + 1);
        }

        for (int i = 0; i < friends.length; i++) {
            for (String key : map.keySet()) {
                String[] keyName = key.split(" ");

                // 주고받은 선물과 선물 지수 표
                if (friends[i].equals(keyName[0])) {
                    exchange[i][arr.indexOf(keyName[1])] = map.get(key);
                    giftIndex[i] += map.get(key);
                }

                // 선물 지수
                if (friends[i].equals(keyName[1])) {
                    giftIndex[i] -= map.get(key);
                }
            }
        }

        for (int i = 0; i < friendsLength; i++) {
            for (int j = i; j < friendsLength; j++) {
                // 선물을 서로 주고 받지 않은 경우 : 선물 지수가 높은 친구에게 선물을 줌
                if ((i != j) && exchange[i][j] == 0 && exchange[j][i] == 0) {
                    if (giftIndex[i] > giftIndex[j]) {
                        value[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        value[j]++;
                    }
                }
                // 선물을 주고 받은 경우 : 선물을 적게준 친구가 선물을 줌
                else if ((i != j) && (exchange[i][j] != 0 || exchange[j][i] != 0)) {
                    if (exchange[i][j] > exchange[j][i]) {
                        value[i]++;
                    } else if (exchange[i][j] < exchange[j][i]) {
                        value[j]++;
                    } else {
                        if (giftIndex[i] > giftIndex[j]) {
                            value[i]++;
                        } else if (giftIndex[i] < giftIndex[j]) {
                            value[j]++;
                        }
                    }
                }
            }
        }

        int answer = 0;
        // 선물을 많이 받은 횟수
        for (int i = 0; i < value.length; i++) {
            answer = Math.max(answer, value[i]);
        }
        
        return answer;
    }
}