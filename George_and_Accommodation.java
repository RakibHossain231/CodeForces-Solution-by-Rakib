import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int room= in.nextInt();
        if(room>=1 && room<=100){
            int capacity[][]= new int[room][2];
            int count=0;
            for(int i=0; i<room; i++){
                capacity[i][0]=in.nextInt();
                capacity[i][1]=in.nextInt();
                if(capacity[i][0]>=0 && capacity[i][0]<=100 && capacity[i][1]>=0 && capacity[i][1]<=100 ){
                    if(capacity[i][1]-capacity[i][0]>=2)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
