import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hores[]= new int[4];
        for(int i=0; i<4; i++){
            hores[i]=in.nextInt();
        }

        int count=0; 
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                if(hores[i]==hores[j] && hores[j]!=-100){
                    count++;
                    hores[j]=-100;
                }
            } 
            
        }
       System.out.println(count);
       in.close();
    }
}
