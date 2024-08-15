import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int k= in.nextInt();

        if(k>=1 && k<=50 && n>=2 && n<=1000000000)
        {
            for(int i=0; i<k; i++){
                if(n>1){
                    if(n%10==0){
                        n=n/10;
                    }
                    else{
                        n--;
                    }
                } 
            }
            System.out.println(n);
        }

        in.close();
    }
}
