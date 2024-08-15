import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b= in.nextInt();
        int c=in.nextInt();

        int result=0;
        int array[]= new int[6];
        array[0]=a+(b*c);
        array[1]=a*(b+c);
        array[2]=a*b*c;
        array[3]=(a+b)*c;
        array[4]=a+b+c;
        array[5]=(a*b)+c;

        for(int i=0; i<6; i++){
            if(array[i]>result){
                result=array[i];
            }
        }
        System.out.println(result);
        in.close();
    }
}
