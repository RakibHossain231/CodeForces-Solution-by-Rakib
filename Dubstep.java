import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s= in.next();

        String []original=s.split("WUB");
        for(int i=0; i<original.length; i++)
        {
            if(i==original.length-1){
                System.out.print(original[i]);
            }
            else{
                System.out.print(original[i]+" ");
            }
        }
        in.close();
    }
}
