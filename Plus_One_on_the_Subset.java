import java.util.Scanner;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int t= in.nextInt();

        for(int i=0; i<t; i++){
            int n= in.nextInt();
            int array[]= new int[n];
            for(int j=0; j<n; j++){
                array[j]= in.nextInt();
            }

            int max=0, min=1000000000;
            for(int j=0; j<n; j++){
                if(array[j]<min){
                    min=array[j];
                }
                if(max<array[j]){
                    max= array[j];
                }
            }
            System.out.println(max-min);
        }
        in.close();
    }
}

// array theke max and min ber korbo , max theke min minus korle ja thakbe ta minimum operation
// for sob gula value same korte
