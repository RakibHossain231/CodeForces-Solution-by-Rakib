import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int a,b;
        a= in.nextInt();
        b= in.nextInt();

        if(a>=1 && a<=10 && b>=1 && b<=10 && a<=b){
            int i=0;
            while (true) {
                a=a*3;
                b=b*2;
                i++;
                if(a>b){
                    break;
                }
            }
            System.out.println(i);
        }
        in.close();
    }
}
