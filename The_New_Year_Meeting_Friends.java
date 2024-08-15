import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c= in.nextInt();

        
        int dif1_2= Math.abs(a-b);
        int dif1_3= Math.abs(a-c);
        int dif2_3=Math.abs( b-c);
        
        if(dif1_2>dif1_3 && dif1_2>dif2_3){
            System.out.println(dif1_3+dif2_3);
        }
        else if(dif1_3>dif1_2 && dif1_3>dif2_3){
            System.out.println(dif1_2+dif2_3);
        }
        else{
            System.out.println(dif1_2+dif1_3);
        }
        

        in.close();
    }
}

// Zei duitar distance kom tader distance er sum print korbo
// absolute value nichi karon distance negative hoy na kintu amr input onujayi negative aste pare tai

