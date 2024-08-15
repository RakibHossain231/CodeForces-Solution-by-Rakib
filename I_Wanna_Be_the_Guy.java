
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        
        int p = in.nextInt();
        int pArray[]= new int[p];
        for (int i = 0; i < p; i++) {
            pArray[i] = in.nextInt();
           
        }
        
        int q = in.nextInt();
        int qArray[]= new int[q];
        for (int i = 0; i < q; i++) {
            qArray[i] = in.nextInt();
        }
        
        int finalAray[]= new int[p+q];
        System.arraycopy(pArray, 0, finalAray, 0, p);
        System.arraycopy(qArray, 0, finalAray, p, q);

        int coutn=0;
        boolean flag=false;
        for(int i=0; i<n; i++){
            for(int j=0; j<p+q; j++){
                if(i+1==finalAray[j]){
                    flag=true;
                    coutn++;
                    break;
                }
            }
            if (flag==false){
                break;  
            }
            flag=false;
            
        }
        if (coutn==n) {
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
        in.close();
    }
}

