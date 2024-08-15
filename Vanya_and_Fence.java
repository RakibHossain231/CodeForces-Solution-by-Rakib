import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int number_of_Person= in.nextInt();
        int height= in.nextInt();

        int persons_Height[]=new int[number_of_Person];
        int count=0;
        for(int i=0; i<number_of_Person; i++){
            int perPersonHeight= in.nextInt();
            if(height<perPersonHeight){
                count+=2;
            }
            else{
                count++;
            }
        }
        System.out.println(count);

        in.close();
    }
}
