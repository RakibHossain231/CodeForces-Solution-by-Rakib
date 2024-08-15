import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        int length= s.length();

        if(length<=100){
            String  s2[]= s.split("");
            ArrayList<Integer> digit= new ArrayList<>();

            int count=0;
            for(int i=0; i<length; i++){
                if(i%2==0){
                    digit.add(Integer.valueOf(s2[i]));
                    count++;
                }
            }
            Collections.sort(digit);
            int count2=0;
            for(int i=0; i<length; i++){
               
                    if(i%2==0){
                    s2[i]=String.valueOf(digit.get(count2));
                    count2++;
                }
            }
            for(String x: s2){
                System.out.print(x);
            }
        }
        in.close();
    }
}
