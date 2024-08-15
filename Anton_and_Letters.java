import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.nextLine();
        int count=0;
        String[] ch=s.split("");
        // for(String x: ch){
        //     System.out.print(x);
        // }

        for(int i=1; i<s.length(); i+=3){
            
            if(ch[i].charAt(0)>='a' && ch[i].charAt(0)<='z'){
                char hold=ch[i].charAt(0);
                count++;
                for(int j=1; j<s.length(); j+=3){
                    if(hold==ch[j].charAt(0)){
                        ch[j]="-100";
                    }
                }
            }
            
        }
        in.close();
        System.out.println(count);
    }
}
