import java.util.ArrayList;
import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        String aray[]= new String[n];

        ArrayList<String> Yes_OR_NO= new ArrayList<>(); 
        ArrayList<Integer> ifBalanced= new ArrayList<>();


        for(int i=0; i<n; i++){

            int a=in.nextInt();
            if(a%4==0){
                
                int array[]= new int[a];

                int evenCount=0;
                int oddCoutn=0;

                int k=a/2;
                for(int j=0; j<a/2; j++){
                    array[j]= 2*(j+1);
                    evenCount+=array[j]; 
                }
                for(int j=0; j<a/2-1; j++){

                    array[k]=2*j+1;
                    oddCoutn+=array[k];
                    k++;
                }
                array[k]=evenCount-oddCoutn;

                System.out.println("YES");
                for(int x: array){
                    System.out.print(x+" ");
                }
                  
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
