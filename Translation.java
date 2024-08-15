import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.nextLine();
        String t= in.nextLine();

        if(s.length()>0 && s.length()<=100 && t.length()>0 && t.length()<=100){
            char ch[]=new char[s.length()];

            int count=0;
            for(int i=s.length()-1; i>=0; i--){
                ch[count]=s.charAt(i);
                count++;
            }

            String ss= String.copyValueOf(ch);
            if(ss.equals(t)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        in.close();
    }
}
