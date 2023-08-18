import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(nums);
        
        int preSum = 0;
        int answer = 0;
        for (int item : nums) {
            preSum += item;
            answer += preSum;
        }
        System.out.print(answer);
    }
}