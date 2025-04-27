#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int i=0; i<t; i++)
    {
        int n, mn= INT_MAX, mnINDEX=0, product=1;
        cin>>n;
        int a[n];
        for(int j=0; j<n; j++)
        {
            cin>>a[j];
            if(a[j]<mn)
            {
                mn=a[j];
                mnINDEX=j;
            }
        }

        a[mnINDEX]=mn+1;
        for(int x: a)
            product*=x;
        cout<<product<<endl;


    }
    return 0;
}

/*
    1. main kaj hocche array er minimum value er sathe 1 add korbo then array er sob
        element er product ber korbo
*/
