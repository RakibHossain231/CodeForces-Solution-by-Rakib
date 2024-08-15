import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt(); 
        int m= in.nextInt();
        int count=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            else{
                count++;
                for(int j=0; j<m; j++){
                    if((count%2!=0 && j==m-1 ) || (count%2==0 && j==0 ) ){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                    
                }
                System.out.println();
                
            }
            
           in.close(); 
        }
    }
}
