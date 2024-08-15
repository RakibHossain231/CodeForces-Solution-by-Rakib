import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long n =in.nextLong();
        in.close();

        
            if(n%2==0){
                System.out.println(n/2);
            }
            else{
                System.out.println(-(n + 1) / 2);
            }
        
    }
}
