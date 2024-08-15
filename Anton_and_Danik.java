import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        in.nextLine();

        if(n>=1 && n<=100000){

            String s= in.nextLine();
            
            int countD=0, countA=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='D'){
                    countD++;
                }
                else{
                    countA++;
                }
            }
            if(countA>countD){
                System.out.println("Anton");
            }
            else if(countA<countD){
                System.out.println("Danik");
            }
            else{
                System.out.println("Friendship");
            }
        }
        in.close();
    }
}
