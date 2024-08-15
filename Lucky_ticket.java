import java.util.Scanner;

public class Lucky_ticket {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        String output[]= new String[n];

        for(int i=0; i<n; i++){
            int number= in.nextInt();
            int array[]= new int[6];

            int rem=0, count=0;
            while(number!=0){
                rem= number%10;
                array[count]= rem;
                count++;
                number/=10;
            }
            if(array[0]+array[1]+array[2]==array[3]+array[4]+array[5])
                output[i]="YES";
            else 
                output[i]="NO";
        }
        in.close();

        for(String x: output)
            System.out.println(x);
    }
}


// 6 digit er ticket number nibo 
// ticket number er prothom 3 digit er sum jodi last 3 digit er sum er soman hoy tahole "YES" else "NO"