import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();

        int array[]= new int[n];
        for(int i=0; i<n; i++){

            int timu= in.nextInt();
            int count=0;

            for(int j=0; j<3; j++){
                int a=in.nextInt();
                if(timu<a){
                    count++;
                }
            }
            array[i]=count;
        }
        in.close();

        for(int x: array){
            System.out.println(x);
        }
    }
}


// first input hocche timur
// porer 3 ta input er mooddhe koyta timur theke boro ta count korbo