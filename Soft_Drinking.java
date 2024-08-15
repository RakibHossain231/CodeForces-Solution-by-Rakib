import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int NumberOfFriends_n = in.nextInt();

        int bottle_k = in.nextInt();
        int drinkdPerBottle_l = in.nextInt();
        int Overallmilliliters= bottle_k*drinkdPerBottle_l;


        int limes_c = in.nextInt();
        int pieceOfLimes_d = in.nextInt();
        int AllPieceOf_limes= limes_c*pieceOfLimes_d; 

        int salt_p = in.nextInt();
        int drinksPerToast_nl = in.nextInt(); 
        int saltPerToast_np = in.nextInt();
        in.close();

        int count=0;
        while (true) {
            AllPieceOf_limes--;
            salt_p-=saltPerToast_np;
            Overallmilliliters-=drinksPerToast_nl;
            if(AllPieceOf_limes>-1 && salt_p>-1 && Overallmilliliters>-1){
                count++;
            }
            else{
                break;
            }
        }

        System.out.println(count/NumberOfFriends_n);
    }     
}

// To make a toast, each friend needs nl milliliters of the drink, a slice of lime and np grams of salt.
