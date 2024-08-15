#include<bits/stdc++.h>

using namespace std;

int main(){

    int n,m;
    cin>>n>>m;
    int count=0;
    int nextprime=0;

    if(m==3){       // jodi n== 2, and m==3 tahole YES
        count++;
        nextprime=m;
    }
    else{      // jodi m!=3 tahole check dite hobe je n er por theke m porjonto ektar beshi prime ache ni


        for(int i=n+1; i<=m; i++){  // n er por theke m porjonto prime check

            bool flag= true;

            for(int j=2; j<i; j++){     // Prime check
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                count++;
                nextprime=i;
                break;
            }
        }
    }
    if(nextprime==m && count==1){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }

    return 0;
}

/* main kaj hocche n er theke shuru kore m jodi n er next prime hoy tahole YES print korbo
    1. n+1 theke shuru kore jodi m porjonto ektar beshi prime pai tahole break kore dibo and value ta
       store kore dekhbo je m er soman kina, hole taile YES print korbo.
    2. m jodi direct 3 hoy tahole YES print hobe,,  tai m==3 hole direct print na kore count barai dichi
        jehetu count er upor base kore print kori tai

*/
