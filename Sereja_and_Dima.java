
import java.util.ArrayList;
import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        ArrayList<Integer> value= new ArrayList<>();
        
        for(int i=0; i<n; i++){
             value.add(in.nextInt());
        }

        in.close();


        int Seraja_Count=0, Dima_count=0,count=-1;
        
        for(int i=0; i<value.size(); i++){

            int max=0;
            count++;
            if(value.getFirst()>value.getLast()){
                max=value.getFirst();
                if(count%2==0){
                    Seraja_Count+=max;
                    value.removeFirst();
                }
                else{
                    Dima_count+=max;
                    value.removeFirst();
                }
            }
            else{
                max=value.getLast();
                if(count%2==0){
                    Seraja_Count+=max;
                    value.removeLast();
                }
                else{
                    Dima_count+=max;
                    value.removeLast();
                }
            } 
            i--;

        }
        
        System.out.println(Seraja_Count+"  "+Dima_count);
    }
}

// index even hole SEREJA count++ hobe count korar age last and first index er modde je boro seta nibo
// then neyer por oita arrayList theke remove kore dibo
// index odd hole DIMA count++ hobe count korar age las and first er moddhe je boro seita nibo
// then neyar por arraylist theke remove kore dibo
// count rakha hoiche index odd, even bujhar jnno
// i-- kora hoiche prottekta value neyer jnno karon list thele remove korle tar size kome jay
// jate size jai thake ta sob check dite pare tai i-- korchi
// MAIN concept hocche SEREJA boro value nibe then DIMA tar porer boro value nibe evabe continue korbe
