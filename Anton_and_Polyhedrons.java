import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n=in.nextInt();
        in.nextLine();

        int sum=0;
        for(int i=0; i<n; i++){
            String s=in.next();
            if(s.equals("Icosahedron")){
                sum+=20;
            }
            else if(s.equals("Cube")){
                sum+=6;
            }
            else if(s.equals("Tetrahedron")){
                sum+=4;
            }
            else if(s.equals("Dodecahedron")){
                sum+=12;
            }
            else{
                sum+=8;
            }        
        }
        in.close();
        System.out.println(sum);
    }
}
