import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int k=input.nextInt();
        int score[]=new int[n];
        int count=0;

        for(int i=0; i<n; i++){
            score[i]=input.nextInt();
        }
        if(k<=n){
            int hold= score[k-1];
             for(int i=0; i<n; i++){
                if(score[i]>0 && score[i]>=hold){
                    count++;
                }
            }
        }
        System.out.println(count);


        input.close();
    }
}
