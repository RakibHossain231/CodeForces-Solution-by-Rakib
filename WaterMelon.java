import java.util.Scanner;

public class WaterMelon{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int weight =r.nextInt();

        double result= weight/2.0;
        if(result%2.0==0.0)
        {
            System.out.println("YES");
        }
        else if(result-1>=2 &&  result+1>=2 && (result+1)%2.0==0.0 && (result-1)%2.0==0.0){
            System.out.println("YES");
        }
        else
        System.out.println("NO");

        r.close();
    }
}