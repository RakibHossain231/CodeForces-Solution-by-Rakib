import java.util.ArrayList;
import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String array1 =in.next();
        String array2= in.next();


        ArrayList<Character> result= new ArrayList<>();

        if(array1.length()==array2.length()){
            for(int i=0; i<array1.length(); i++){
                char r1=array1.charAt(i);
                char r2=array2.charAt(i);
                if((r1=='0' || r1=='1') && (r2=='0' || r2=='1')){
                    if(r1==r2){
                        result.add('0');
                    }
                    else{
                        result.add('1');
                    }
                }
                else{
                    break;
                }
            }
        }
        for( Character x: result){
            System.out.print(x);
        }

        in.close();
    }
}
