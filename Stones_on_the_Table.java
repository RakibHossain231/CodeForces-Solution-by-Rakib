import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        if(n<=50 && n>=1){
            in.nextLine();
            String s= in.nextLine();
            int count=0;

            for(int i=1; i<s.length(); i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
