import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();

        if(str.length()<=100 && str.length()>=1){
            int UpperCount=0, LowerCount=0;

            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    UpperCount++;
                }
                else {
                    LowerCount++;
                }
            }
            
            if(UpperCount==LowerCount || LowerCount>UpperCount){  
                System.out.println(str.toLowerCase());
            }
            else{
                System.out.println(str.toUpperCase());
            }
        }

        in.close();
    }
}
