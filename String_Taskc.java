import java.util.ArrayList;
import java.util.Scanner;

public class String_Taskc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s= in.nextLine();
        String s3=s.toLowerCase();
        int length= s.length();
        if(length<=100){

            ArrayList<Character> consonant= new ArrayList<>();
            
        
            for(int i=0; i<length; i++){
                char s1[] = s3.toCharArray();
                if(s1[i]!='a' && s1[i]!='e' && s1[i]!='i'
                && s1[i]!='o' && s1[i]!='u' && s1[i]!='y'){
                    
                    consonant.add(s1[i]);
                
                }
            }

            String result[]= new String[consonant.size()*2];
            int count1=0;
            for(int i=0; i<consonant.size()*2; i++){
                if(i%2==0){
                    result[i]=".";
                }
                else{
                    result[i]=""+consonant.get(count1);
                    count1++;
                }
            }
            for(int i=0; i<result.length; i++){
                System.out.print(result[i]);
            }
        }
        in.close();
    }
}
