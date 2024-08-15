import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int sum=0;
        int count=0;
        
        for(int i=0;  i<n; i++){
            if(sum==n){
                break;
            }
            else{
                if((sum+100)<=n){
                    sum+=100;
                    count++;
                }
                else if((sum+20)<=n){
                    sum+=20;
                    count++;
                }
                else if((sum+10)<=n){
                    sum+=10;
                    count++;
                }
                else if((sum+5)<=n){
                    sum+=5;
                    count++;
                }
                else if((sum+1)<=n){
                    sum+=1;
                    count++;
                }
            }
        }
        System.out.println(count);

        in.close();
    }
}
