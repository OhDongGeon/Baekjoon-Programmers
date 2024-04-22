import java.io.*;
import java.util.*;

class Member {
    private int seq;
    private int age;
    private String name;
    
    public Member (int seq, int age, String name) {
        this.seq = seq;
        this.age = age;
        this.name = name;
    }
    
    public int getSeq() {
        return seq;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(i, Integer.parseInt(st.nextToken()), st.nextToken());
        }
        
        Arrays.sort(members, (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getSeq() - o2.getSeq();
            }
            return o1.getAge() - o2.getAge();
        });
        
        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.getAge()).append(" ").append(member.getName()).append("\n");
        }
        System.out.println(sb);
    }
}