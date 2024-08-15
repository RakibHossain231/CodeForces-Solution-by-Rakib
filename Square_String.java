import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();

        for(int i=0; i<t; i++){
            in.nextLine();
            String s= in.next();
            char ch[]= s.toCharArray();

            if(s.length()%2!=0){
                System.out.println("NO");
            }
            else{

                int length=s.length()/2;
                boolean flag= true;
                for(int j=0; j<length; j++){
                    if(ch[j]!=ch[length+j]){
                        flag= false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        in.close();
    }
}

// main kotha hocche same string duibar ache ni check dibo
// jodi string lenght odd hoy tohole direct NO print korbo
// jodi even hoy tahole index 0 check dibo index ordhek theke, evave last obdi check dibo jodi
// same thake value tahole YES else NO