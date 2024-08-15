import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // length of string a
            int m = scanner.nextInt(); // length of string b
            scanner.nextLine(); // consume newline
            
            String a = scanner.nextLine(); // string a
            String b = scanner.nextLine(); // string b
            
            int k = findMaxLength(a, b);
            System.out.println(k);
        }
        
        scanner.close();
    }
    
    public static int findMaxLength(String a, String b) {
        int maxLength = 0;
        int idxA = 0;
        int idxB = 0;
        
        while (idxA < a.length() && idxB < b.length()) {
            if (a.charAt(idxA) == b.charAt(idxB)) {
                maxLength++;
                idxA++;
            }
            idxB++;
        }
        
        return maxLength;
    }
}
