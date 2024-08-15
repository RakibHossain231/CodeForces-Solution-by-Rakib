import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int Burle[]= new int[n];
        int maxBurle=0, maxBurleIndex=0;
        for(int i=0; i<n; i++){
            int currency= in.nextInt();
            if(maxBurle<currency){
                maxBurle=currency;
                maxBurleIndex=i;
            }
            Burle[i]=currency;
        }
        in.close();

        int needBurle=0;
        for(int i=0; i<n; i++){
            if(i!=maxBurleIndex){
                needBurle+=(maxBurle-Burle[i]);
            }
        }
        System.out.println(needBurle);
    }
}

// Main kotha hoiche jar sorboccho burle currency ache baki sobaike
// tar soman currency kortre total koto currency lagbe

// sorboccho currency ber korbo whit index
// baki sobar currency max er theke bad diye summ korbo without max currency index