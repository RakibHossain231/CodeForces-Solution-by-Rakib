import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n= in.nextInt();
        int mCount=0, cCoutn=0;

        for(int i=0; i<n; i++){
            int m= in.nextInt();
            int c= in.nextInt();
            if(m>c){
                mCount++;
            }
            if(c>m){
                cCoutn++;
            }
        }
        if(mCount>cCoutn){
            System.out.println("Mishka");
        }
        else if(mCount<cCoutn){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}

// Mishka and Chris er modde jar value boro tar count++
// same value hole count korbo na
// jar count boro tar name print, equal hole {Friendship is magic!^^} 
