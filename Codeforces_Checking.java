import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();

        String s="codeforces";
        char charray[]= s.toCharArray();
        String result[]= new String[n];

        in.nextLine();
        

        for(int i=0; i<n; i++){
            String ch=in.next();
            boolean flag= false;
            for(int j=0; j<s.length(); j++){
                if(ch.charAt(0)==charray[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                result[i]="YES";
            }
            else{
                result[i]="NO";
            }
        }

        for(String x: result){
            System.out.println(x);
        }
    }
}
