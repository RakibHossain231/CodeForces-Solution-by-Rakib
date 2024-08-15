import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        String s= in.nextLine();
        char ch[]= new char[n];
        s=s.toLowerCase();
        for(int i=0; i<n; i++){
            ch[i]=s.charAt(i);
        }

        
        int cha=97, count=0;
        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                if(ch[j]==(char)cha){
                    count++;
                    break; 
                }
               
            }
            cha+=1;
        }
        
        if(count==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
        
    }
}
