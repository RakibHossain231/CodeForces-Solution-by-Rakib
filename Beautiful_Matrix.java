import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int matrix[][]= new int[5][5];
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matrix[i][j]= in.nextInt();
            }
        }

        int row=0;
        int column=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(matrix[i][j]==1){
                    row=j;
                    column=i;
                }
            }    
        }
        int row1, column1;
        row1=(row-2);
        if(row1<0){
            row1=row1*(-1);
        }

        column1=(column-2);
        if(column1<0){
            column1=column1*(-1);
        }
        System.out.println(row1+column1);
        in.close();
    }
}
