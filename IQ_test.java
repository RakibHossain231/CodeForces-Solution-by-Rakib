import java.util.Scanner;
 
public class IQ_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int evenCount = 0, oddCount = 0, oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <=n; i++) {
            int x = in.nextInt();
            if(x % 2 == 0){
                evenCount++;
                evenIndex = i;
            }
            else{
                oddCount++;
                oddIndex = i;
            }
        }
        if(evenCount == 1){
            System.out.println(evenIndex);
        }
        else{
            System.out.println(oddIndex);
        }

        in.close();
    }
}

// we find the unique number from all input then we print the index number of unique number
// if maybe there can be any Even or Odd number then we will find and print otherwise not