import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long n=in.nextLong();
        long position=in.nextLong();

        long oddCount = (n + 1) / 2;
        
        if (position <= oddCount) {
           
            System.out.println(2 * position - 1);
        } 
        else {
          
            System.out.println(2 * (position - oddCount));
        }
       
        in.close();
    }
}
