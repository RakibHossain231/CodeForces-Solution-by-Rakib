import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        in.nextLine();
        String []array= new String[n];
        for(int i=0; i<n; i++){
            String s= in.nextLine();
            String hold= s.toUpperCase();
            if(hold.equals("YES")){
                array[i]="YES";
            }
            else{
                array[i]="NO";
            }
        }
        in.close();

        for(String x: array){
            System.out.println(x);
        }
    }   
}

// Input check dibo Yes kina upper/Lower doesn't metter
// yes hole YES onno kichu hole NO