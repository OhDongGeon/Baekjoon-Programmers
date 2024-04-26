import java.io.*;
import java.util.*;

class Guitar {
    private String serial;
    private int serialLength;
    private int numberCount;
    
    public Guitar (String serial, int serialLength, int numberCount) {
        this.serial = serial;
        this.serialLength = serialLength;
        this.numberCount = numberCount;
    }
    
    public String getSerial() {
        return serial;
    }
   
    public int getSerialLength() {
        return serialLength;
    }
    
    public int getNumberCount() {
        return numberCount;
    }
}


public class Main {
    public static void main (String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Guitar[] guitars = new Guitar[N]; 
        
        for (int i = 0; i < N; i++) {
            String serialNumber = br.readLine();
            int serialNumberLength = serialNumber.length();
            int serialNumberCount = 0;
            
            for (int j = 0; j < serialNumberLength; j++) {
                char checkNumber = serialNumber.charAt(j);
                
                if (Character.isDigit(checkNumber)) {
                    serialNumberCount += (checkNumber - '0');
                }
            }
            
            guitars[i] = new Guitar(serialNumber, serialNumberLength, serialNumberCount);
        } 
        
        Arrays.sort(guitars, (o1, o2) -> {
            if (o1.getSerialLength() == o2.getSerialLength()) {
                if (o1.getNumberCount() == o2.getNumberCount()) {
                	 return o1.getSerial().compareTo(o2.getSerial());
                }
                return o1.getNumberCount() - o2.getNumberCount();
            }
            return o1.getSerialLength() - o2.getSerialLength();
        });
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(guitars[i].getSerial()).append("\n");
        }
        System.out.println(sb);
    }
}