import java.util.Scanner;

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        in.close();
        
        if(n>=0){
            System.out.println(n);
        }
        else{
            int a = n / 10;
            int b = n / 100 * 10 + n % 10;
            if(a>b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }

    }
}

// if account number is positive then oitai print
// jodi negative then last 2 tar theke zeita boro tare remove kore dibo oita bade ja asbe tai ee ans 