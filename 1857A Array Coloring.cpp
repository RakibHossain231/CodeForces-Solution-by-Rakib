#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int i=0; i<t; i++)
    {
        int n, sum=0, temp;
        cin>>n;
        for(int j=0; j<n; j++)
        {
            cin>>temp;
            sum+=temp;
        }
        if(sum%2==0)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    return 0;
}

/*
    i.  mainly ber korte hobe array ke duita part e vag korle dui part er sum hoy odd hobe or even hobe
    ii. if the total sum is odd that means the total number is not divide any two parts
        (any two odd part or any two even part), like  1 2 4 {1+2 odd, 4 even},
        {1+4 odd, 2 even}, {2+4 even, 1 odd} so not same
*/
