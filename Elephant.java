import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x=in.nextInt();
        if(x>0 && x<=1000000){
            int result= (int)(Math.ceilDiv(x, 5));
            System.out.println(result);
        }
        

        in.close();
    }
}
