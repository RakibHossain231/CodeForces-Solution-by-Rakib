import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int k= in.nextInt();

        int teamCount=0, eligibleCount=0;
        for(int i=0; i<n; i++){
            int participant=in.nextInt();   // participant koybar ongso grohon korche ta input
            if(5-participant>=k){
                eligibleCount++;            // eligible hoite hole k er soman ba koro hote hobe 5-participant
            }
            if(eligibleCount==3){           // team make kore eligible abr zero kore dibo
                teamCount++;
                eligibleCount=0;
            }
        }
        in.close();

        System.out.println(teamCount);
    }
}

// main kotha hocceh emon 3 members er team create korte hobe jar sorbo nimno k time baki ache
// 5 times er moddhe

// participant koybar ongsho grohon korche ta jodi 5 times theke minus kore k er soman ba tar
// boro hoy tahole take team a add kora jabe, evabe 3 jon kore koyta team hoy ta count korte hobe 
