import java.util.ArrayList;
import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        in.nextLine();

        for(int i=0; i<t; i++){
            int n= in.nextInt();

            ArrayList<Character> hold= new ArrayList<>();
            in.nextLine();

            String s= in.next();

            boolean flag= true;
            if(n==1){   // n=1 hole always "YES"
                    hold.add(s.charAt(0));
            }      
            else{
                for(int j=0; j<n; j++){
                    if(j==n-1){ // Last character er jnno
                        if(s.charAt(j)==s.charAt(j-1)){
                            hold.add(s.charAt(j-1));
                        }
                        else{
                            hold.add(s.charAt(j));
                        }
                    }
                    else{ // otherrs character er jnno
                        if(s.charAt(j)!=s.charAt(j+1)){
                            hold.add(s.charAt(j));
                        }
                    }
            }
        }
            
            int count=0;
            for(int j=0; j<hold.size(); j++){  // Duplicate check
                for(int k=j+1; k<hold.size(); k++){
                    if(hold.get(j)==hold.get(k)){
                        count++;
                        break;
                    }
                }
                if(count>0){
                    break;
                }
            }
            
            if(count>0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}

// same sequence er duplicate gula bad dichi like AABBCCA= ABCA
// dupicate bad deyar por jodi pura array te abr duplicate pai tahole "NO" else "YES"