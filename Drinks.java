import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=in.nextInt();
        }
        double result=(double)sum/n;
        System.out.println(String.format("%.12f", result));
        in.close();
    }
}
