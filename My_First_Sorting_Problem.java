import java.util.Scanner;

public class My_First_Sorting_Problem{
    public static void main(String[] args) {
        
        Scanner inp= new Scanner(System.in);
        int test= inp.nextInt();

        for(int i=0; i<test; i++){
            int x=inp.nextInt();
            int y= inp.nextInt();

            if(x>y){
                System.out.println(y+" "+x);
            }
            else{
                System.out.println(x+" "+y);
            }
        }
        inp.close();
    }
}