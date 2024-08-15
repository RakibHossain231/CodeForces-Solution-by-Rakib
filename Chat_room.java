import java.util.Scanner;

public class Chat_room {
   public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.next();
        if(s.length()>=1 && s.length()<=100){
            boolean flag= false;
            String[] ch=s.split("");
            for(int i=0; i<s.length(); i++){
                if(ch[i].equals("h")){
                    for(int j=i+1; j<s.length(); j++){
                        if(ch[j].equals("e")){
                            for(int k=j+1; k<s.length(); k++){
                                if(ch[k].equals("l")){
                                    for(int l=k+1; l<s.length(); l++){
                                        if(ch[l].equals("l")){
                                            for(int m=l+1; m<s.length(); m++){
                                                if(ch[m].equals("o")){
                                                    flag=true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(flag==true){
                System.out.println("YES");
            }
            else{
                    System.out.println("NO");
            }
               
        }

        in.close();
   } 
}
