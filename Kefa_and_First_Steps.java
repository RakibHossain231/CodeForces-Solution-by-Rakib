import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int array[]= new int[n];

        for(int i=0; i<n; i++){
            array[i]=in.nextInt();
        }

        int count=1;
        int max=1;

        for(int i=0; i<n-1; i++){
            if(array[i]<=array[i+1]){
                count++;     
            }
            if(array[i]>array[i+1] || i==n-2){
                if(max<count){
                    max=count;
                    
                }
                count=1;
            }
        }
        
        System.out.println(max);

        // 10
        // 1 2 3 4 1 2 3 4 5 6

        in.close();     
    }
}
