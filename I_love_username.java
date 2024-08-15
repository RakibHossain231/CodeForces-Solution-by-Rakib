import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();

       
        int count=0;

        int points[]= new int[n];
        for(int i=0; i<n; i++){
            points[i]= in.nextInt();
            if (i!=0) {

                
                boolean flag= true;
                for(int j=0; j<i; j++){
                    if(points[j]<points[i]){
                        flag=true;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                if(flag==false){
                    for(int j=0; j<i; j++){
                        if(points[j]>points[i]){
                            flag=true;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    } 
                }
                if(flag==true){
                    count++;
                }
            }
        }
        in.close();
        System.out.println(count);
        
    }
}

// n songkhok input nibo
// zeita input nibo tar ager sob gular theke jodi oita choto/boro hoy tahole count korbo
// count print korbo
// check deyar jnnno index 1 theke shuru korbo karon previous er sathe compare korte hobe
