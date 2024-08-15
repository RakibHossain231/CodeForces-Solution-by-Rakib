import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int testCase= in.nextInt();

        for(int i=0; i<testCase; i++){
            long n= in.nextLong();
            if(n%2!=0 && n>1){
                System.out.println("YES");
            }
            else if(n>=6){
                boolean flag= false;
                int odd=3;
                long div = n;
                while (div > 2) {
                    div /= 2;
                    if (div % 2 == 1 && n % div == 0) {
                        flag = true;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}

// n input neyar por 1 er theke bor kintu odd hoy tahole YES
// jodi n>=6 then check dibo tar ordhek ke 2 dara devide kore 1 ase ni and n ke div value diye
// divide kore 0 ase ni. asle flag true brek na asle divide 2>div porjonto calabo
