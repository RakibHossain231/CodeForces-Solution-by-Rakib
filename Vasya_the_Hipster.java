import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int red= in.nextInt();
        int blue = in.nextInt();

        int a=0;
        if(red<blue){
            a=blue-red;
            int b= a/2;
            System.out.println(red+" "+b);

        }
        else{
            a=red-blue;
            int b= a/2;
            System.out.println(blue+" "+b);
        }
        in.close();
    }
}
