import java.util.Scanner;

public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.nextLine();
        in.close();

        boolean flag=false;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                flag= true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(s.length()==1){
            if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
                System.out.println(Character.toLowerCase(s.charAt(0)));
            }
            else{
                System.out.println(Character.toUpperCase(s.charAt(0)));
            }
        }
        else if(flag==true){
            char []array= new char[s.length()];
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                    array[i]=Character.toLowerCase(s.charAt(i));
                }
                else{
                    array[i]= Character.toUpperCase(s.charAt(i));
                }
            }

            for(char x: array){
                System.out.print(x);
            }
        }
        else{
            System.out.println(s);
        }

    }
}


// if all character are Capital exept 1st letter
// then we change upper to lowe, lower to upper then print
// if all character are not capital then print original String