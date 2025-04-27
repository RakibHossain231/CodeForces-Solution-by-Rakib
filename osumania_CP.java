import java.util.Scanner;

public class osumania_CP{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int test = in.nextInt();
        for(int i=0; i<test; i++){

            int n=in.nextInt();
            int array[]= new int[n];
            int count=0;
            for(int j=0; j<n; j++)
            {
                String st=in.next();
                for(int k=0; k<4; k++)
                {
                    if(st.charAt(k)=='#')
                    {
                        array[count]=k+1;
                        break;
                    }
                }
                count++;
            }
            for(int j=n-1; j>=0; j--)
            {
                System.out.print(array[j]+" ");
            }
            System.out.println();
            
        }       
        in.close();
    }
}
