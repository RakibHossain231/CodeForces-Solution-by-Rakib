import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int numberOfCoins=in.nextInt();
        int array[]= new int[numberOfCoins];
        int sum1=0;
        for(int i=0; i<numberOfCoins; i++){
            array[i]=in.nextInt();
            sum1+=array[i];
        }
        int halfOfsum=sum1/2;
       

        Arrays.sort(array);
        int count=0, sum=0; 

        for(int i=numberOfCoins-1; i>=0; i--){
            
            if(sum<=halfOfsum){
                sum+=array[i];
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
        in.close();
    }
}
