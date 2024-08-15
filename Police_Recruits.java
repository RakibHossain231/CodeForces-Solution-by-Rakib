import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();

        int crime=0;
        int pulice=0;
        int count=0;

        for(int i=0; i<n; i++){
            int c= in.nextInt();

            if(c!=-1){
                pulice+=c;
            }
            else{
                crime++;
                if(pulice>0){
                    crime--;
                    pulice--;
                }
                else{
                    count++;
                }
            }

        }
        in.close();
        System.out.println(count);
        
    }
}
