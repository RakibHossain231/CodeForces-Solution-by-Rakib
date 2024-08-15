import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s1,s2;
        s1= in.nextLine();
        s2= in.nextLine();
        int length1=s1.length();
        int length2= s2.length();

        String s3=s1.toUpperCase();
        String s4= s2.toUpperCase();
        

        if((length1>=1 && length1<=100) && (length2>=1 && length2<=100) && (length1==length2)){
            int flag=0;
            for(int i=0; i<length1; i++){
                char ch1=s3.charAt(i);
                char ch2= s4.charAt(i);
                if(ch1<ch2){
                    flag=-1;
                    break;
                }
                else if(ch1>ch2){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            System.out.println(flag);
        }
        in.close();
    }
}
