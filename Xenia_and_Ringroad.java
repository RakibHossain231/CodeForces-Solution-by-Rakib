import java.util.Scanner;

public class Xenia_and_Ringroad {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int house= in.nextInt();
        int works= in.nextInt();
        int houseNumner[]= new int[works];

        for(int i=0; i<works; i++ ){
            houseNumner[i]= in.nextInt();
        }
        in.close();


        long steps=houseNumner[0]-1;
        for(int i=0; i<works-1; i++){
           if(houseNumner[i]>houseNumner[i+1]){
                steps=steps+house-(houseNumner[i]-houseNumner[i+1]);
           }
           else if(houseNumner[i]<houseNumner[i+1]){
                steps+=houseNumner[i+1]-houseNumner[i];
           }
        }

        System.out.println(steps);
    }
}

// house 1 alway step e add hobe index[0] -1 diye
// jodi index[i]>index[i+1] then trick hocche {house-(houseNumner[i]-houseNumner[i+1])}
// jodi index[i]<index[i+1] then trick hocche {houseNumner[i+1]-houseNumner[i]}
// jodi index[i]=index[i+1] then trick hocche {Tahole kono kaj/move kora lagbe na}