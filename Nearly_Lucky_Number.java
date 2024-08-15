import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        long n= in.nextLong();
        int count=0;
        while(n>0){
            long r=n%10;
            if(r==4 || r==7){
                count++;
            }
             n=n/10;
        }

        int lucky[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        boolean flag=false;
        for(int i=0; i<lucky.length; i++){
            if (count == lucky[i]){
                flag=true;
                break;

            }
        }
        if(flag==true)
        System.out.println("YES");
        else
        System.out.println("NO");
        
        in.close();
    }
}
