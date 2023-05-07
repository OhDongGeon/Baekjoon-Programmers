import java.util.*;

public class Main {
    public static void main(String[] arg) {
        int[] dwarf = new int[9];
        int sum = 0;
        boolean chk = false;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = sc.nextInt(); 
            sum += dwarf[i];
        }
        
        Arrays.sort(dwarf);
        
        for (int i = 0; i < dwarf.length; i++) {
            for (int j = i + 1; j < dwarf.length; j++) {
                if (sum - dwarf[i] - dwarf[j] == 100) {
                    dwarf[i] = -1;
                    dwarf[j] = -1;
                    chk = true;
                    break;
                }
            }
            if (chk) {
                break;
            }
        }
        
        for (int i = 0; i < dwarf.length; i++) {
            if (dwarf[i] != -1) {
                System.out.println(dwarf[i]);
            }
        }
    }
}