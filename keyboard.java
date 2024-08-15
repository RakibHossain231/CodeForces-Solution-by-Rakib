import java.util.Scanner;

public class keyboard{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        
        String hold1 = "qwertyuiop";
        String hold2 = "asdfghjkl;";
        String hold3 = "zxcvbnm,./";

        String x= in.next();
        char ch= x.charAt(0);
        String s= in.next();
        in.close();

        if( ch == 'L'){
            for (int j = 0; j < s.length(); j++){
                for (int i = 0; i < 10; i++){
                    if(hold1.charAt(i)==s.charAt(j)){
                        System.out.print(hold1.charAt(i+1));
                    }
                    else if(hold2.charAt(i)==s.charAt(j)){
                        System.out.print(hold2.charAt(i+1));
                    }
                    else if(hold3.charAt(i)==s.charAt(j)){
                        System.out.print(hold3.charAt(i+1));
                    }
                }
     
            }
        }
        else{
            for (int j = 0; j < s.length(); j++){
                for (int i = 0; i < 10; i++){
                    if(hold1.charAt(i)==s.charAt(j)){
                        System.out.print(hold1.charAt(i-1));
                    }
                    else if(hold2.charAt(i)==s.charAt(j)){
                        System.out.print(hold2.charAt(i-1));
                    }
                    else if(hold3.charAt(i)==s.charAt(j)){
                        System.out.print(hold3.charAt(i-1));
                    }
                }
     
            }
        }
    }
}

// keyword gula 3 ta array te niye nibo
// if Character id 'R' jar sathe milbe tar ager ta print korbo else porer ta print korbo