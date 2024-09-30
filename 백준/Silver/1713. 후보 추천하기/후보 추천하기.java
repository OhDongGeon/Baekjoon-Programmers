import java.util.*;
import java.io.*;

class Picture {
    int number;
    int cnt;
    int last;
    
    public Picture(int number, int cnt, int last) {
        this.number = number;
        this.cnt = cnt;
        this.last = last;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Picture[] pictures = new Picture[101];
        List<Picture> arr = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (pictures[num] != null) {
                pictures[num].cnt++;
            } else {
                if (arr.size() == N) {
                    arr.sort((o1, o2) -> {
                        if (o1.cnt == o2.cnt) {
                            return o1.last - o2.last;
                        } else {
                            return o1.cnt - o2.cnt;
                        }
                    });
                    
                    Picture delete = arr.remove(0);
                    pictures[delete.number] = null;
                }
                
                pictures[num] = new Picture(num, 1, i);
                arr.add(pictures[num]);
            }
        }
        
        arr.sort((o1, o2) -> o1.number - o2.number);
        
        for (Picture picture : arr) {
            System.out.print(picture.number + " ");
        }
    }
}