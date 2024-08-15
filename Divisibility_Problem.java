import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        int array[]= new int[n];
    
        if(n>=1 && n<=10000){
            for(int i=0; i<n; i++){
                int a=in.nextInt();
                int b=in.nextInt();
                int r=a%b;
                if(r==0){
                    array[i]=0;
                }
                else{
                    array[i]=b-r;
                }
    
            }
            for(int x: array){
                System.out.println(x);
            }
        }

        in.close();
    }
}
