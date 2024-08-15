import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int array[]= new int[n];

        for(int i=0; i<n; i++){
            array[i]= in.nextInt();
        }
        in.close();

        ArrayList <Integer> arr= new ArrayList<>();
        for(int i=0; i<n; i++){
            int num=array[i];
            int count=1, itemCount=0;
            int rem;
            
            while(num!=0){
                rem=num%10;
                if (rem!=0) {
                    itemCount++;
                    arr.add(rem*count);
                }
                count=count*10;
                num=num/10;
            }
            System.out.println(itemCount);
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
            arr.removeAll(arr);
            
        }
    }
}

// every purno shongkha should to separate without 0
// purno shongkha joto number index e pabo purno shongkha plus samne totota zero bosbe
// koyta purno shongkha pabo ta count kobo 
// age count print korbo then value gula

