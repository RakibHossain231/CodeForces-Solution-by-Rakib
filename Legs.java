import java.util.Scanner;

public class Legs{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        int t= in.nextInt();
        for(int i=0; i<t; i++)
        {
            int leg= in.nextInt();
            int rem= leg%4;
            if(rem==0){
                System.out.println(leg/4);
            }
            else{
                int cow=leg/4;
                int chicken=rem/2;
                System.out.println(cow+chicken);
            }
        }

       
        in.close();
    }
}