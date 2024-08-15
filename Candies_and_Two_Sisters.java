import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        int numberOFTest= in.nextInt();
        int arra[]= new int[numberOFTest];
        for(int i=0; i<numberOFTest; i++){
            arra[i]=in.nextInt(); 
        }


        for(int i=0; i<numberOFTest; i++){ 

            if(arra[i]==1 || arra[i]==2){
                System.out.println(0);
            }
            else{
                if(arra[i]%2==0){
                    System.out.println((arra[i]/2)-1);
                }
                else{
                    System.out.println(arra[i]/2);
                }
            }
        }
        in.close();
    }
}

// 3
// 0
// 0
// 1
// 999999999
// 381621773