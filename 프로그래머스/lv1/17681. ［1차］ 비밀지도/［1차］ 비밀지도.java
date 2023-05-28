class Solution {
    public String map(int num, int length) {
        StringBuilder binary = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        
        return binary.toString();
    }
    
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            StringBuilder password = new StringBuilder(n);
            String pwd1 = map(arr1[i], n);
            String pwd2 = map(arr2[i], n);
            
            for (int j = 0; j < n; j++) {
                if (pwd1.charAt(j) == '1' || pwd2.charAt(j) == '1') {
                    password.append('#');
                } else {
                    password.append(' ');
                }
            }
            
            answer[i] = password.toString();
        }
        
        return answer;
    }
}


// class Solution {
//     public String map(int num, int length) {
//         String binary = "";
        
//         for (int i = 0; i < length; i++) {
//             binary = num % 2 + binary;
//             num /= 2;
//         }
//         return binary;
//     }
    
    
//     public String[] solution(int n, int[] arr1, int[] arr2) {
//         String[] answer = new String[n];
        
//         for (int i = 0; i < n; i++) {
//             String pwd1 = map(arr1[i], n); 
//             String pwd2 = map(arr2[i], n); 
//             String password = "";
            
//             for (int j = 0; j < n; j++) {
//                 if (pwd1.charAt(j) == '1' || pwd2.charAt(j) == '1') {
//                     password += "#";
//                 } else {
//                     password += " ";
//                 }
//             } 
//             answer[i] = password;
//         }
        
//         return answer;
//     }
// }