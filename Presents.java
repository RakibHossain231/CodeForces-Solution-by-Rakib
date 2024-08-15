import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int array[]= new int[n];

        for(int i=0; i<n; i++){
            array[i]= in.nextInt();
        }
        in.close();

        int result[]= new int[n];
        int count=0;
        for(int i=0; i<n; i++){
            int index= i;
            for(int j=0; j<n; j++){
                if(i+1==array[j]){
                    index= j;
                    array[j]=101;
                    break;
                }
            }
            result[count]=index+1;
            count++;
        }

        for(int x: result){
            System.out.print(x+" ");
        }
    }
}


// array er valu gula 1 theke n porjonto thakbe sure but double thakbe na karon ta dara friend bujhay
// outer array calabo [array index 0 but array value start hoy 1 theke tai index+1] jei value index er sathe milbe ta 
// oi index+1 hocche answer,, amr jehetu smallest theke khuje ber kora lagbe tai ami outer index  er shuru theke
// compare korchi jate smallest gula age pawa jay,, r pawar por oi value ke range er ceye boro value diye replace
// korchi jate R smallest hisabe count e na ase;