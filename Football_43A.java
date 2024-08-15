import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        in.nextLine();

        String team1= in.next();
        String team2="";

        int team1Goal=1, team2Goal=0;
        
        for(int i=1; i<n; i++){
            String s= in.next();
            if(s.equals(team1)){
                team1Goal++;
            }
            else{
                team2=s;
                team2Goal++;
            }
        }
        in.close();

        if(team1Goal>team2Goal){
            System.out.println(team1);
        }
        else{
            System.out.println(team2);
        }
    }
}


// duita team thakbe jotobar tader nam totota tader goal.
// tai prothome ekta team niye nichi tar goal o 1 dhore nichi karon loop ekbar kom calabo
// jodi prothom team er sathe porer input gula match kore tahole team1 er count barabo
// na hole team 2 er count barabo r team2 te notun team er nam print korar jnno rakhbo