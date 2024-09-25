import java.util.*;
import java.io.*;

public class Main {

  static int N, M;
  static int[][] arr;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[N + 1][N + 1];
    visited = new boolean[N + 1];

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());
      arr[num1][num2] = 1;
      arr[num2][num1] = 1;
    }

    int answer = 0;
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        dfs(i);
        answer++;
      }
    }
    System.out.println(answer);
  }

  static void dfs(int num) {
    visited[num] = true;

    for (int i = 1; i <= N; i++) {
      if (!visited[i] && arr[num][i] == 1) {
        dfs(i);
      }
    }
  }
}