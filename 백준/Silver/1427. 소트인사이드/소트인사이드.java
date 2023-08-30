import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        sc.close();
        String[] nArr = Long.toString(N).split("");
        Arrays.sort(nArr, Comparator.reverseOrder());
        System.out.println(String.join("", nArr));

    }
}