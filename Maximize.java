import java.util.Scanner;

public class Maximize {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int t= in.nextInt();
        for(int i=0; i<t; i++){

            int x= in.nextInt();
            int value1= findGCD(x, 1)+1;
            int maxY=1;
            for(int j=2; j<x; j++){
                
                int value2= findGCD(x, j)+j;

                if(value1<value2){
                    maxY=j;
                    value1= value2;
                }
                


            }

            System.out.println(maxY);

        }
        in.close();
    }
}
