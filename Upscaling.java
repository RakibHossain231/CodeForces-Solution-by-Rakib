import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int m= in.nextInt();
        int arr[]= new int[m];
        for(int k=0; k<m; k++){
            arr[k]=in.nextInt();
        }
        
        for(int k=0; k<m; k++){
            int n= arr[k];
            
            for(int i=0; i<n; i++){
            
            
                if(i%2==0){
                    for(int j=0; j<n; j++){
    
                        
                       if(j%2==0){
                        System.out.print("##");
                       }
                       else{
                        System.out.print("..");
                       }
                        
                        
                    }
                    System.out.println();
                    for(int j=0; j<n; j++){
    
                        
                        if(j%2==0){
                         System.out.print("##");
                        }
                        else{
                         System.out.print("..");
                        }
                         
                         
                     }
                     System.out.println(); 
                    
                      
                }
                
                else{
                    
                    for(int j=0; j<n; j++){
                        
                        if(j%2==0){
                            System.out.print("..");
                           }
                           else{
                            System.out.print("##");
                           }  
                    }
                    System.out.println();
                
                    for(int j=0; j<n; j++){
                        
                        if(j%2==0){
                            System.out.print("..");
                           }
                           else{
                            System.out.print("##");
                           }  
                    }
                    System.out.println();
                }
                
            }

        }
        
        
        in.close();
    }
}
