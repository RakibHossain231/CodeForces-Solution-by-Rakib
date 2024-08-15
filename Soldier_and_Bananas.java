import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int k,n,w;
        k=in.nextInt();
        n=in.nextInt();
        w= in.nextInt();

        if(k>=1 && k<=1000 && w>=1 && w<=1000 && n>=0 && n<=1000000000){
            int total=0;
            for(int i=1; i<=w; i++){
                total+=i*k;
            }
            int result= total-n;
            if(result<0){
                System.out.println(0);
            }
            else{
                System.out.println(Math.abs(result));
            }
        }
        in.close();
    }
}
