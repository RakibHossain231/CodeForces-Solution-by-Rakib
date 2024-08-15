import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        
        if(n>=1 && n<=100){

            int[][]  array= new int[n][3];
            for(int i=0; i<n; i++){
                for(int j=0; j<3; j++){
                    int value= input.nextInt();
                    if(value>=-100 && value<=100){
                        array[i][j]=value;
                    }
                    else{
                        j--;
                    }
                }
            }

            int result[]= new int[3];
            int count=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<3; j++){
                    result[count]= array[i][j]+result[count];
                    count++;
                }
                count=0;
            }


            boolean flag= true;

            for(int x: result){
                if(x!=0){
                    flag=false;
                }
            }
            if(flag== true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
           
        }
        input.close();
    }
}
