import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int index[]= new int[n];

        for(int i=0; i<n; i++){

            int m= in.nextInt();
            int value[]= new int[m];

            for(int j=0; j<m; j++){     // input
                value[j]= in.nextInt();
            }

            int duplicat=0;
            for(int j=0; j<m; j++){

                int hold=value[j];
                for(int k=j+1; k<m; k++){  // duplicate check, paile -1 dara replace korchi
                    if(hold==value[k]){
                        value[k]=-1;
                        duplicat++;
                    }
    
                }
                if(duplicat>0){         // jodi duplicate thake tahole hold takeo -1 korchi
                    value[j]=-1;
                    break;
                }
            }

            for(int j=0; j<m; j++){     // -1 bade jeita pabo oitai unique
                if(value[j]!=-1){
                    index[i]=j+1;
                }
            }
        
        }
        in.close();

        for(int x: index){
            System.out.println(x);
        }

    }
}

// jeita duplicate ache oitare -1 kore dibo
// jodi duplicate pai tahole jeitar sathe compare kore duplicate paichi oitareo -1 kore dibo
// -1 bade jei value thakbe oitai unique number, tar index+1 hold kore print korbo