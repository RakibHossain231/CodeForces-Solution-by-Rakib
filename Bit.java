import java.util.Scanner;

public class Bit{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int x=0;
        int n=input.nextInt();
        input.nextLine();
        if(n>=0 && n<=150){
            for(int i=0; i<n; i++){
                String ch1=input.nextLine();
                

                
                if(ch1.equals("++X") || ch1.equals("X++")){
                    x++;
                }
                else{
                    x--;
                }
            }
            System.out.println(x);
        }
        input.close();
    }
}