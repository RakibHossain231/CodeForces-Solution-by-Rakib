import java.util.Arrays;
import java.util.Scanner;

public class Dragons_230A {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        int s= in.nextInt();
        int n= in.nextInt();

        int dragon[][]=new int[n][2];

        for(int i=0; i<n; i++)
        {
            dragon[i][0]=in.nextInt();
            dragon[i][1]= in.nextInt();
        }

        Arrays.sort(dragon, (a, b) -> Integer.compare(a[0], b[0]));
        
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (s > dragon[i][0]) {
                s += dragon[i][1];
            } else {
                System.out.println("NO");
                flag= false;
                return;
            }
        }

       if(flag=true)
       {
            System.out.println("YES");
       }

        in.close();
    }
}


// 1st er ta Initial strength, 2nd ta hocche koyta pair thakbe
// pair er 1st er ta Dragons, 2nd ta bonus point
/*  ami ze kono order e drangons er sathe compare korte parbo tai sort kore nilam
    jate sob ceye kom dragons er sathe fight kore jitte pari and bonus pai shurute
    N.B: sort ta dragons dara hobe but sathe sathe bonus tao sort hobe karon dragons
    er sathe pair akare thake bonus like dragons er jnnno bonus fixed
*/
// flag use korchi ami jodi sob round e jiti tahole kokhonoi flag false hobe na