import java.util.Scanner;

public class A_Plus_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int sum[]= new int[n];

        for(int i=0; i<n; i++){
            String s= in.next();
            char ch[]= s.toCharArray();

            sum[i]=(ch[0]-48)+(ch[2]-48);
        }
        in.close();

        for(int x: sum){
            System.out.println(x);
        }
    }
}

// String akare input nibo
// separate korbo character array te
// sum korbo array er 0 and 2 number index ke then print kore dibo
