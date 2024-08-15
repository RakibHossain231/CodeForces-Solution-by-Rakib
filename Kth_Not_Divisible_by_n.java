import java.util.Scanner;

public class Kth_Not_Divisible_by_n {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt(); 

        for (int i=0; i<t; i++) {
            long n = in.nextLong();
            long k = in.nextLong();

            long divide = k / (n - 1);   // 7/2=3
            long remainder = k % (n - 1); // 7%2=1

            long result;
            if (remainder == 0) {
                result = divide * n - 1;
            } else {
                result = divide * n + remainder;  
            }

            System.out.println(result);
        }

        in.close();
    }
}
