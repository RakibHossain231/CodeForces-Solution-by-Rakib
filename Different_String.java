import java.util.*;

public class Different_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int k=0; k<t; k++){
            String s= sc.next();

            char array[]=s.toCharArray();

            boolean flag= true;
            
            for(int i=1; i<s.length(); i++){
                if(array[0]!=array[i]){
                    flag=false;
                    char hold= array[i];
                    array[i]=array[0];
                    array[0]= hold;
                    break;
                }
            }
            if(flag==false){
                System.out.println("YES");
                for(char p: array){
                    System.out.print(p);
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }

        }

        sc.close();

    }
}
