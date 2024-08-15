import java.util.Scanner;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        char array[]= new char[n]; 
        for(int i=0; i<n; i++){
            int a= in.nextInt(); 
            int b= in.nextInt();
            int c= in.nextInt();

            if(a+b==c){
                array[i]='+';
            }
            else{
                array[i]='-';
            }
        }
        in.close();

        for(char x: array){
            System.out.println(x);
        }
    }
}
