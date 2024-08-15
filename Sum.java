import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();

        String array[]= new String[n];
        for(int i=0; i<n; i++){
            int max=0;
            int a=0,b=0;
            for(int j=0; j<3; j++){
                int num= in.nextInt();
                if(num>max){
                    int hold=max;
                    max=num;
                    a= b; 
                    b= hold;

                }
                else{
                    a=b;
                    b=num;
                }
            }
            if(a+b==max){
                array[i]="YES";
            }
            else{
                array[i]="NO";
            }
        }
        in.close();

        for(String x: array){
            System.out.println(x);
        }
    }
}

// 3 tar moddhe max ber korchi
// then baki zei 2 Ta thake tader summation max er soman hole YES else NO
