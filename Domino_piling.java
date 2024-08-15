import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int m= in.nextInt();
        int n= in.nextInt();

        if(m>=1 && m<=16 && n>=1 && n<=16){
            int result=(m*n)/2;
            System.out.println(result);
        }
        in.close();
        
    }
}
