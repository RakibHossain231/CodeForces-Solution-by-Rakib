import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int number=input.nextInt();
        input.nextLine();
        for(int i=0; i<number; i++){

            String array=input.nextLine();

            int len= array.length();
            if(len<=10){
                System.out.println(array);
            }
            else{
                char ch1=array.charAt(0);
                char ch2=array.charAt(len-1);
                System.out.println(ch1+""+(len-2)+ch2+"");
            }
        }
        
        input.close();
    }
    
}
