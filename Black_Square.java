import java.util.Scanner;

public class Black_Square {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int a,b,c,d;
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        d= in.nextInt();

        in.nextLine();

        String s= in.next();
        in.close();

        int score=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                score+=a;
            }
            else if(s.charAt(i)=='2'){
                score+=b;
            }
            else if(s.charAt(i)=='3'){
                score+=c;
            }
            else{
                score+=d;
            }
        }
        System.out.println(score);
    }
}

// 4 ta score value input nibo and ekta string input nibo
// String ke character wise check dibo and score e add korbo, character '1'==a, '2'==b, '3'==c, '4'==d
// total score print korbo
