import java.io.*;

public class Main {
    static boolean[][] visited = new boolean[6][6];
    static int[] dx = {1, 2, 1, 2, -1, -2, -1, -2};
    static int[] dy = {2, 1, -2, -1, -2, -1, 2, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] move = new String[37];
        for (int i = 0; i < 36; i++) {
            move[i] = br.readLine();
        }
        move[36] = move[0];
        
        String answer = "Valid";
        for (int i = 0; i < 36; i++) {
            int lx = move[i].charAt(0) - 'A';
            int ly = move[i].charAt(1) - '0' - 1;
            
            if (visited[lx][ly]) {
                answer = "Invalid";
                break;
            }
            visited[lx][ly] = true;
            
            int nextX = move[i + 1].charAt(0) - 'A';
            int nextY = move[i + 1].charAt(1) - '0' - 1;

            boolean check = false;
            for (int j = 0; j < 8; j++) {
                if ((lx + dx[j] == nextX) && (ly + dy[j]) == nextY) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                answer = "Invalid";
                break;
            }
        }
        
        System.out.println(answer);
    }
}