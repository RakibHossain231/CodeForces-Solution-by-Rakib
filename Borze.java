import java.util.ArrayList;
import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s= in.next();

        in.close();
        char ch[]= s.toCharArray();
        ArrayList<Integer> value= new ArrayList<>();

        for(int i=0; i<ch.length; i++){
            if(ch[i]=='.'){
                value.add(0);
            }
            else if(ch[i]=='-'){
                if(ch[i+1]=='.'){
                    value.add(1);
                }
                else if(ch[i+1]=='-'){
                    value.add(2);
                }
                i++;
            }
        }

        for(Integer x: value){
            System.out.print(x);
        }
    }
}

// string input nibo then ta character array te convert korbo
// jodi (.) pai tahole tar mani 0
// jodi (-) pai then check dibo tar porer ta (.) kina hole 1 ar i ek barabo mani i++
// jodi (-) pai then check dibo tar porer ta (-) kina hole 2 ar i ek barabo mani i++
