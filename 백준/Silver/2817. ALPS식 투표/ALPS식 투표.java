import java.util.*;

public class Main {

    public static void ReverseOrder(StaffScore[] staffScores) {
        for (int i = 0; i < staffScores.length; i++) {
            for (int j = 0; j < i; j++) {

                if (staffScores[i].staffScore > staffScores[j].staffScore) {
                    StaffScore cur = staffScores[i];
                    
                    for (int k = i; k > j; k--) {
                        staffScores[k] = staffScores[k - 1];
                    }
                    staffScores[j] = cur;
                }
            }
        }
    }


    public static class StaffScore {
        int staffIdx;
        double staffScore;

        StaffScore(int staffIdx, double staffScore) {
            this.staffIdx = staffIdx;
            this.staffScore = staffScore;
        }
    }


    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int usedStaff = 0;
        double cut = X * 0.05;

        boolean[] staffAll = new boolean[26];
        int[] usedChip = new int[26];

        for (int i = 0; i < N; i++) {
            String staff = sc.next();
            int chip = sc.nextInt();
            if (chip >= cut) {
                int index = staff.charAt(0) - 'A'; 
                staffAll[index] = true;
                usedChip[index] = chip;
                usedStaff++;
            }
        }
        
        StaffScore[] staffScores = new StaffScore[usedStaff * 14];
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (staffAll[i]) {
                for (int j = 1; j <= 14; j++) {
                    staffScores[cnt++] = new StaffScore(i, (double) usedChip[i] / j);
                }
            }
        }
        
        ReverseOrder(staffScores);
        int[] answer = new int[26];
        for (int i = 0; i < 14; i++) {
            answer[staffScores[i].staffIdx]++;
        }


        for (int i = 0; i < 26; i++) {
            if (staffAll[i]) {
                System.out.println((char)(i + 'A') + " " + answer[i]);
            }
        }
    }
}