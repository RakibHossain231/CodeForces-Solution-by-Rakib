#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t, n;
    cin>>t;
    while(t--)
    {
        cin>>n;
        if((n-1)%3==0 || (n+1)%3==0)
            cout<<"First"<<endl;
        else
            cout<<"Second"<<endl;
    }

    return 0;
}

/*
    i. if n ke 1 jog/biyog kore 3 dara mod korle 0 hoy tahole vanya win
    ii. else vova win
*/
