
import java.util.Arrays;
import java.util.Scanner;
    
public class puzzle {
   
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfStudent = in.nextInt();

        int n = in.nextInt();
        int[] arr= new int[n];
        
        for(int i =  0 ;i < n;i++){
            arr[i]= in.nextInt();
        }
        in.close();

        int right = numberOfStudent-1;
        Arrays.sort(arr);

        int  difference=arr[n-1]-arr[0];
        if(numberOfStudent == n){
            System.out.println(arr[right]-arr[0]);
        }
        else{
            for(int i=0; i<n; i++){
                if(right!=n){
                    int hold=arr[right]-arr[i];
                    if(hold<difference){
                        difference=hold;
                    }
                    right++;
                }
                else{
                    break;
                }
            }
            System.out.println(difference);
        }
        
    }
}

// First of all dekhbo student and puzzle songkkha same ni tahole sort kore min differrence ta nibo
// jodi puzzle shongkha beshi hoy tahole beshi ja hobe ta theke and shuru theke difference ber korbo


