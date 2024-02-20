import java.io.*;
import java.util.*;

public class Main {

    static String[] information;
    static int[] floor;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        information = br.readLine().split(" ");
        int F = Integer.parseInt(information[0]);
        floor = new int[F + 1];

        System.out.println(bfs(F));
    }

    public static String bfs(int F) {

        Queue<Integer> queue = new LinkedList<>();
        int S = Integer.parseInt(information[1]);
        queue.offer(S);
        floor[S] = 1;

        int G = Integer.parseInt(information[2]);
        int U = Integer.parseInt(information[3]);
        int D = Integer.parseInt(information[4]);

        while (!queue.isEmpty()) {

            int myFloor = queue.poll();

            if (myFloor == G) {
                return String.valueOf(floor[myFloor] - 1);
            }

            if (F >= myFloor + U && floor[myFloor + U] == 0) {
                floor[myFloor + U] = floor[myFloor] + 1;
                queue.offer(myFloor + U);
            }

            if (0 < myFloor - D && floor[myFloor - D] == 0) {
                floor[myFloor - D] = floor[myFloor] + 1;
                queue.offer(myFloor - D);
            }
        }
        return "use the stairs";
    }
}