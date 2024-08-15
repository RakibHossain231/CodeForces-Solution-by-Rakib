import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int remainTime[]= new int[n];

        for(int i=0; i<n; i++){
            int hour= in.nextInt();
            int minute= in.nextInt();
            int hourRemain=0;
            int minuteREmain=0;

            if(minute==0){
                hourRemain= 24-hour;
            }
            else{
                hourRemain= 23-hour;
                minuteREmain=60-minute;
            }
             
            int totalminute= (hourRemain*60)+minuteREmain;
            remainTime[i]= totalminute;
            
        }
        in.close();

        for(int x: remainTime){
            System.out.println(x);
        }
    }
}

// if input minute is zero then 24-input hour and minut is zero
// if input nimute isn't zero then 23-hour and 60-input minute
