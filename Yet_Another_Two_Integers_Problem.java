

import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int array[]= new int[n];
        
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int difference = Math.abs(a - b);
            int count = difference / 10; 
            if (difference % 10 != 0) {
                count++;
            }
            array[i]=count;
            
        }
        in.close();

        for(int x: array){
            System.out.println(x);
        }
    }
}
// Calculate the absolute difference between a and b 
// Calculate the minimum number of moves by dividing the difference by 10
// karon age 10 boro number diye add or subtract
// jodi defference er remainder zero na hoy then one moves extra lagve
