import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String players = in.next();

        int count0=0, count1=0;
        for(int i=0; i<=players.length()-7; i++)
        {
            if(players.charAt(i)=='0'){
                count0++;
                for(int j=i+1; j<i+7; j++){
                    if(players.charAt(j)=='0'){
                        count0++;
                    }
                    else{
                        count0=0;
                        break;
                    }
                }    
            }
            if(count0==7){
                break;
            }
            if(players.charAt(i)=='1'){
                count1++;
                for(int j=i+1; j<i+7; j++){
                    if(players.charAt(j)=='1'){
                        count1++;
                    }
                    else{
                        count1=0;
                        break;
                    }
                }    
            }
            if(count1==7){
                break;
            }
        }

        

        if(count0>=7 || count1>=7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        in.close();
       
    }
}

