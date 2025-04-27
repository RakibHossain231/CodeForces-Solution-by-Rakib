import java.util.Scanner;

public class Minimize_CP{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int test= scan.nextInt();
        for(int i=0; i<test; i++)
        {
            int a=scan.nextInt();
            int b= scan.nextInt();
            int result=100;

            for(int c=a; c<=b; c++){
                if(result> ((c-a)+(b-c)))
                {
                    result=((c-a)+(b-c));
                }
            }
            System.out.println(result);
        } 
        scan.close();
    }
}