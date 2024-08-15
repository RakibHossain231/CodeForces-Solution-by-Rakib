import java.util.ArrayList;
import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        in.nextLine();
        
        ArrayList<Character> result= new ArrayList<>();
        
        for(int j=0; j<n; j++){
            result.removeAll(result);
            System.out.println();
            String s= in.next();
            char ch[]=s.toCharArray();

            for(int i=0; i<ch.length-1; i++){
                if( i==0){ 
    
                    result.add(ch[0]);
                }
                else if(ch[i]==ch[i-1]){
                    result.add(ch[i]);
                    i+=1;
                } 
            }
            result.add(ch[s.length()-1]);
            for(Character x: result){
                System.out.print(x);
            }  
        }
        in.close();
    }
}

// index 0 and last value of String always thakbe
// 1 index theke last er tar ag porjonot check dibo double paile prothom ta nibo
// ekta arrayList e rakhbo then print deyar por array clear kore dibo