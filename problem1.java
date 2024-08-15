import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
        Scanner inn= new Scanner(System.in);
        int t= inn.nextInt();
        inn.nextLine();

        for(int i=0; i<t; i++){
            String s1= inn.next();
            char[] c1= s1.toCharArray();
            
            String s2= inn.next();
            char []c2= s2.toCharArray();

            char ch1= s1.charAt(0);
            char ch2= s2.charAt(0);
            c1[0]=ch2;
            c2[0]= ch1;

            System.out.println(String.valueOf(c1)+" "+String.valueOf(c2));
            

        }

        
        inn.close();
    }
}