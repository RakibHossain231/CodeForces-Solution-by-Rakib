import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int tram= in.nextInt();
        int[][]array= new int[tram][2];
        
        for(int i=0; i<tram; i++){
            for(int j=0; j<2; j++){
                array[i][j]=in.nextInt();
            }
        }

        int remain=0;
        int capacity=array[0][1];
        for(int i=0; i<tram-1; i++){
            remain=(remain+array[i][1])-array[i+1][0];
            int max= remain+array[i+1][1];
            if(capacity<max){
                capacity=max;
            }
        }
        System.out.println(capacity);

        in.close();
    }
}
