#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    for(int i=0; i<t; i++){
            cout<<"\n";
        int a,b,c;

        cin>>a>>b>>c;
        if(a==b){
            cout<<c;
        }
        else if(a==c){
            cout<<b;
        }
        else{
            cout<<a;
        }
    }

    return 0;
}
