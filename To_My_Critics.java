import java.util.Scanner;

public class To_My_Critics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();

        for(int i=0; i<t; i++){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();

            if((a+b>=10) || (a+c>=10) || (b+c>=10)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}

// 3 ta input a,b,c er moddhe jodi zekono duita add kore 10 er soman ba boro pai
// tahole "YES" print korbo otherWise "NO" 
