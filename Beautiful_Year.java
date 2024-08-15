import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int year=in.nextInt();

        if(year>=1000 && year<=9000){
            int count=1;
            while(true){
                int temp_year=year+count;
                boolean flag=true;

                int array[]= new int[4];
                for(int i=0; i<4; i++){
                    int r= temp_year%10;
                    array[i]=r;
                    temp_year/=10;

                }

                for(int i=0; i<4; i++){
                    for(int j=i+1; j<4; j++){
                        if(array[i]==array[j]){
                            flag= false;
                            break;
                        }
                    }
                }
                if(flag==true){
                    int y=array[3];
                    for(int i=2; i>=0; i--){
                        y=y*10+array[i];
                        
                    }
                    System.out.println(y);
                    break;
                }
                count++;

            }
        }
        in.close();
    }
}
