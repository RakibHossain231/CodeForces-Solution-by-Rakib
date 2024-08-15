import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem_Alternative {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        
        int n= in.nextInt();
        int []array= new int[n];
        
        for(int i=0; i<n; i++ ){
            int a= in.nextInt();
            int b= in.nextInt();
            

            if(a<b){
                int count=0;
                while(a!=b){
                    a+=10;
                    count++;
                    if(a>b){
                        if(b==a-9){
                            a=a-9;
                            array[i]=count;
                        }
                        else if(b==a-8){
                            a=a-8;
                            array[i]=count;
                        }
                        else if(b==a-7){
                            a=a-7;
                            array[i]=count;
                        }
                        else if(b==a-6){
                            a=a-6;
                            array[i]=count;
                        }
                        else if(b==a-5){
                            a=a-5;
                            array[i]=count;
                        }
                        else if(b==a-4){
                            a=a-4;
                            array[i]=count;
                        }
                        else if(b==a-3){
                            a=a-3;
                            array[i]=count;
                        }
                        else if(b==a-2){
                            a=a-2;
                            array[i]=count;
                        }
                        else if(b==a-1){
                            a=a-1;
                            array[i]=count;
                        }
                        else{
                            array[i]=count;
                        }
                    }
                }
            }
            else if(a==b){
                int count=0;
                array[i]=count;
            }
            else{
                int count=0;
                while(a!=b){
                    a-=10;
                    count++;
                    if(a<=b){
                        if(b== a + 9){
                            a=a+9;
                            array[i]=count;
                        }
                        else if(b==a+8){
                            a=a+8;
                            array[i]=count;
                        }
                        else if(b==a+7){
                            a=a+7;
                            array[i]=count;
                        }
                        else if(b==a+6){
                            a=a+6;
                            array[i]=count;
                        }
                        else if(b==a+5){
                            a=a+5;
                            array[i]=count;
                        }
                        else if(b==a+4){
                            a=a+4;
                            array[i]=count;
                        }
                        else if(b==a+3){
                            a=a+3;
                            array[i]=count;
                        }
                        else if(b==a+2){
                            a=a+2;
                            array[i]=count;
                        }
                        else if(b==a+1){
                            a=a+1;
                            array[i]=count;
                        }
                        else{
                            array[i]=count;
                        }
                    }
                    
                }        
            }
        }
          
        in.close();

        for(int x: array){
            System.out.println(x);
        }
        
    }
}
