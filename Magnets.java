import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();

        if(n>=1 && n<=100000){

            int array[]= new int[n];
            int count=1;

            for(int i=0; i<n; i++){
                array[i]=in.nextInt();
            }
            if(n>1){
                
                for(int i=0; i<n-1; i++){
                    if(array[i]!=array[i+1]){
                        count++;
                    }
                }
                System.out.println(count);
                
            }
            else{
                System.out.println("1");
            }
            
        }

        in.close();
    }
}
