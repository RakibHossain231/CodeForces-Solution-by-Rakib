import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        long m= input.nextLong();
        long n= input.nextLong();
        long a= input.nextLong();

        long r1=0,r2=0;
        if((m>=1 && m<=1000000000) && (n>=1 && n<=1000000000) && (a>=1 && a<=1000000000)){

            if(a==1){
    
            System.out.println((long)(m*n));
            }
            else{

                if(m>a){
                    r1= (int)(m/a);
                    if(m%a!=0){
                        r1++;
                    }
                }
                else{
                    r1=1;
                }

                if(n>a ){
                    r2= (int)(n/a);
                    if(n%a!=0){
                        r2++;
                    }
                }
                else{
                    r2=1;
                }
                System.out.println(r1*r2);
            }
        }
         input.close();
    }    
}
