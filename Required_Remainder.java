import java.util.Scanner;

 
public class Required_Remainder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextInt();
        long x, y, n;
        
        for (int i = 0; i < t; i++) {
            x= sc.nextInt();
            y  = sc.nextInt();
            n = sc.nextInt();
            if((n%x)< y){
                System.out.println(n-(n%x)-(x-y));
            }
            else if((n%x)>y){
                System.out.println(n+y-(n%x));
            }
            else System.out.println(n);
        }
    
    }
    
}