import java.util.Scanner;

public class Stair_Peak_or_Neither {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int numberOfTest=in.nextInt();
        int array[][]= new int[numberOfTest][3];
        for(int i=0; i<numberOfTest; i++){

            for(int j=0; j<3; j++){
                array[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<numberOfTest; i++){

            if(array[i][0]<array[i][1] && array[i][0]<array[i][2] && array[i][1]<array[i][2] ){
                System.out.println("STAIR");
            }
            else if(array[i][0]<array[i][1] && array[i][2]<array[i][1]){
                System.out.println("PEAK");
            }
            else{
                System.out.println("NONE");
            }
        }

        in.close();

    }
}