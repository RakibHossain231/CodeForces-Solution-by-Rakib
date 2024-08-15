import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int number= in.nextInt();

        boolean flag= true;
        boolean flagNum=true;
        for(int i=4; i<1000; i++){
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                if(digit==4 || digit==7){
                    flagNum= true;
                }
                else{
                    flagNum= false;
                    break;
                }
                temp/=10;
            }
            if(flagNum== true && number%i==0){
                System.out.println("YES");
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("NO");
        }
        in.close();
    }
}
