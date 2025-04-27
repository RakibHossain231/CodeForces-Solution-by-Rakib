import java.util.Scanner;

public class Again_Twenty_Five
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n= in.nextLong();
        long x= (long) Math.pow(5, n);

        String str= String.valueOf(x);

        System.out.println("25");
    
        in.close();
    }
}

// proccess
// Calculate 5^n then convert to string
// I have to need last to index

// But always print 25 that's why direct print