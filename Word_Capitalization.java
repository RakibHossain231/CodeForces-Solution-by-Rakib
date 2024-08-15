import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s= in.nextLine();
        int length=s.length();
        if(length<=1000){
            String[] s2= s.split("");
            s2[0]=s2[0].toUpperCase();
            for(String x: s2){
                System.out.print(x);
            }
        }

        in.close();
    }
}
