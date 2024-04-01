import java.io.*;
import java.util.*;

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Location> stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            int laser = Integer.parseInt(st.nextToken());

            while (true) {
                if (stack.isEmpty()) {
                    stack.push(new Location(i, laser));
                    sb.append("0 ");
                    break;
                }

                Location location = stack.peek();

                if (location.y > laser) {
                    stack.push(new Location(i, laser));
                    sb.append(location.x).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        System.out.println(sb);
    }
}