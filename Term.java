import java.util.Scanner;

public class Term {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x=input.nextInt();

        int array[][]=new int[x][3];

        int result=0;
        for(int i=0; i<x; i++){
            int agree=0;
            for(int j=0; j<3; j++){
                array[i][j]=input.nextInt();
            }
            for(int j=0; j<3; j++){
                if(array[i][j]==1){
                    agree++;
                }
            }

            if(agree>=2){
                result++;
            }
        }

        System.out.println(result);
        input.close();
    }
}
