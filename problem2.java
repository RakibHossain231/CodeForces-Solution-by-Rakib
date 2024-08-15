import java.util.*;

public class problem2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
       for(int i=0; i<test; i++) {
            int n = in.nextInt();
            int finalSum = 0;
            int x=0;
            
            for (int j = 2; j <= n; j++) {
                int sum=0;
                for(int k=2; k<=n; k++){
                    if(k%j==0){
                        sum+=k;
                    }
                }
                
                if (sum > finalSum) {
                    finalSum = sum;
                    x = j;
                }
            }    
            System.out.println(x);
        }
        in.close();
    }
}
