import java.util.Scanner;

public class Game_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;

        // input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        // checked how many times conflict jersey number with opponent team

        for (int i = 0; i < n; i++) {   // jara invite korbe tader jersey
            for (int j = 0; j < n; j++) {   // jara asbe tader jersry
                if (i != j && a[i] == b[j]) {   // i!=j means nijera nijeder duita jersey eksathe porte parbe na
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}

// Approach
// ekta team er duita jersey thake
// check korte hobe je khelar somoy duita team er jersey same kina
// joto bar same hobe totobar count hobe
// jar mathe khelte asbe se 1 number jersey porbe je asbe se 2 number jersey porbe
// jodi same hoy taholei count korbo