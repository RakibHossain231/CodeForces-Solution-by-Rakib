import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int numberOfMilitary = in.nextInt();
        int soldier[]= new int[numberOfMilitary];
        int maxIndex=0, max=0, minIndex=0, min=0;

        for(int i=0; i<numberOfMilitary; i++ ){
            soldier[i]= in.nextInt();
                if(min==0){
                    min=soldier[0];
                }
                if(max<soldier[i]){
                    max= soldier[i];
                    maxIndex=i;
                }
                if(min>=soldier[i]){
                    min= soldier[i];
                    minIndex=i;
                }
        }

    
        if(maxIndex>minIndex){
            int result= (maxIndex)+((numberOfMilitary-minIndex)-2);
            System.out.println(result);
        }
        else{
            int result= (maxIndex)+((numberOfMilitary-minIndex)-1);
            System.out.println(result);
        }
        in.close();
    }
}

// max index ke 0 index e ante koy ghor par howa lage
// min ke lats index e nite koy ghor par howa lage
// if max index > minIndex tahole tader moddhe ekbar swap hobe max ke 0 index e anar somoy tai total theke 2 minus
// if max index < minIndex then shudhu position e jaite ja lage tar theke 1 minus 
// cause like 1 index to 3 index kaj kora lagbe 2 swap lagbe 2 bar R amra hisab korchi index diya tai 1 minus 