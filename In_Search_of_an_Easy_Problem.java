import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int people= in.nextInt();
        if(people>=1 && people<=100){
            
            int array[]= new int[people];
            for(int i=0; i<people; i++){
                array[i]=in.nextInt();
            }

            boolean flag= false;
            for(int i=0; i<people; i++){
                if(array[i]==1){
                    flag =true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("HARD");
            }
            else{ 
                System.out.println("EASY");
            }
        }
        in.close();
    }
}
