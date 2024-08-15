import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int numberOfGroup=in.nextInt();
        int fourCount=0;
        int threeCount=0;
        int twoCount=0;
        int oneCount=0;
        int numberOfTaxi=0;
        
        for(int i=0; i<numberOfGroup; i++){
            int children= in.nextInt();
            if(children==4){
                fourCount++;
            }
            else if(children==3){
                threeCount++;
            }
            else if(children==2){
                twoCount++;
            }
            else{
                oneCount++;
            }
        }

        numberOfTaxi+=fourCount;
        if(threeCount==0){
            numberOfTaxi+=Math.ceil(((Math.ceil(oneCount/2.0))+twoCount)/2.0);
        }
        else{
            if(threeCount<oneCount){
                numberOfTaxi+=threeCount;
                int a=oneCount-threeCount;
                twoCount+=Math.ceil(a/2.0);
                numberOfTaxi+=Math.ceil(twoCount/2.0);
            }
            else{
                numberOfTaxi+=threeCount;
                numberOfTaxi+=Math.ceil(twoCount/2.0);
            }
        }
        in.close();

        System.out.println(numberOfTaxi);
        
        
    }
}
