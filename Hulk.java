import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        String odd="I hate ";
        String even="I love ";
        if(n>=1 && n<=100){
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    System.out.print(odd);
                }
                else{
                    System.out.print(even);
                }
                if(i<n){
                    System.out.print("that ");
                }
                if(i==n){
                    System.out.print("it");
                }
            }
        }
        in.close();
    }
}
