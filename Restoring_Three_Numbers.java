import java.util.ArrayList;
import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        ArrayList<Integer> array= new ArrayList<>();
        int a_b_c=0, index=0;
        for(int i=0; i<4; i++){
            int value= in.nextInt();
            if(value>a_b_c){
                a_b_c=value;
                index=i;
            }
            array.add(value);
        }
        in.close();

        array.remove(index);
        int a = a_b_c - array.get(2);
        int b = a_b_c - array.get(1);
        int c = a_b_c - array.get(0);

        System.out.println(a+" "+b+" "+c);
    }
}

// Max take a+b+c dhore nichi
// baki gulare sequence onujayi dhore nichi like a+b, a+c, b+c
// a= a+b+c - b+c
// b= a+b+c - a+c
// c= a+b+c - a+b
