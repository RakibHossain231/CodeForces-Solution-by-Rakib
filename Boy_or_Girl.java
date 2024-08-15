import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s1= in.nextLine();
        String s=s1.toLowerCase();
        int length=s.length();


        if(length<=100){
            String ch[]= s.split("");
            int count=0;
            int flag=0;
            for(int i=0; i<length; i++){
                for(int j=i+1; j<length; j++){
                    if(ch[i].equals(ch[j])){
                        flag=1;
                    }
                }
                if(flag==0){
                    count++;
                }
                flag=0;
            }
            if(count%2==0){
                System.out.println("CHAT WITH HER!");
            }
            else{
                System.out.println("IGNORE HIM!");
            }
        }
        in.close();
    }
}
