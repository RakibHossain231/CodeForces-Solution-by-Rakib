
import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int array[]= new int[n];
        
        for(int i=0; i<n; i++){
            array[i]= in.nextInt();
        }

        in.close();

        Arrays.sort(array);

        for(int x: array){
            System.out.print(x+" ");
        }
        
    }
}

// sort array by ascending order then print