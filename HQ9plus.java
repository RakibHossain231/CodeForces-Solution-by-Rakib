import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.nextLine();

        boolean flag= true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9'){
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
