import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        String array[]= new String[n];
        for(int i=0; i<n; i++){
            int rating= in.nextInt();
            if(rating<=1399){
                array[i]="Division 4";
            }
            else if( rating>=1400 && rating<=1599){
                array[i]="Division 3";
            }
            else if( rating>=1600 && rating<=1899){
                array[i]="Division 2";
            }
            else{
                array[i]="Division 1";
            }
        }

        in.close();

        for(String x: array){
            System.out.println(x);
        }
    }
}
