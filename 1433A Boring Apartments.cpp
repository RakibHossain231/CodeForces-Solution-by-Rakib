#include <bits/stdc++.h>

using namespace std;


int main() {
    int t;
    cin >> t;

    for(int i=0; i<t; i++){
        int n, count=0;
        cin>>n;

        int hold= n;
        int rem= hold%10;
        if(rem==1){
            if(n==1){
                count=1;
            }else if(n==11){
                count=1+2;
            }else if(n==111){
                count=3+3;
            }else if(n==1111){
                count=6+4;
            }
        }else if(rem==2){
            if(n==2){
                count=10+1;
            }else if(n==22){
                count=10+1+2;
            }else if(n==222){
                count=10+3+3;
            }else if(n==2222){
                count=10+6+4;
            }

        }else if(rem==3){

            if(n==3){
                count=20+1;
            }else if(n==33){
                count=20+1+2;
            }else if(n==333){
                count=20+3+3;
            }else if(n==3333){
                count=20+6+4;
            }
        }else if(rem==4){
            if(n==4){
                count=30+1;
            }else if(n==44){
                count=30+1+2;
            }else if(n==444){
                count=30+3+3;
            }else if(n==4444){
                count=30+6+4;
            }
        }else if(rem==5){
            if(n==5){
                count=40+1;
            }else if(n==55){
                count=40+1+2;
            }else if(n==555){
                count=40+3+3;
            }else if(n==5555){
                count=40+6+4;
            }
        }else if(rem==6){
            if(n==6){
                count=50+1;
            }else if(n==66){
                count=50+1+2;
            }else if(n==666){
                count=50+3+3;
            }else if(n==6666){
                count=50+6+4;
            }
        }else if(rem==7){
            if(n==7){
                count=60+1;
            }else if(n==77){
                count=60+1+2;
            }else if(n==777){
                count=60+3+3;
            }else if(n==7777){
                count=60+6+4;
            }
        }else if(rem==8){
            if(n==8){
                count=70+1;
            }else if(n==88){
                count=70+1+2;
            }else if(n==888){
                count=70+3+3;
            }else if(n==8888){
                count=70+6+4;
            }
        }else if(rem==9){
            if(n==9){
                count=80+1;
            }else if(n==99){
                count=80+1+2;
            }else if(n==999){
                count=80+3+3;
            }else if(n==9999){
                count=80+6+4;
            }
        }
        cout<<count;
        cout<<"\n";
    }

    return 0;
}

