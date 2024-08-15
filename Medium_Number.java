import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int medium[]= new int[n];

        for(int i=0; i<n; i++){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();

            if((a>b && b>c) || (c>b && b>a)){
                medium[i]=b;
            }
            else if((b>a && a>c) || (b<a && a<c)){
                medium[i]=a;
            }
            else{
                medium[i]=c;
            }
        }

        in.close();

        for(int x: medium){
            System.out.println(x);
        }
    }
}

// 3 ta number modhhe je mahjari tare print korbo
