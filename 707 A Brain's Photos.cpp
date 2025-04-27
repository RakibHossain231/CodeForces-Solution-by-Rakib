#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,m;
    cin>>n>>m;

    bool flag= false;
    char ch;

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            cin>>ch;
            if(ch=='C' || ch=='M' || ch=='Y')
                flag=true;
        }
    }
    if(flag==true)
        cout<<"#Color"<<endl;
    else
        cout<<"#Black&White"<<endl;

    return 0;
}

/*
    i. if there are any of C,M, Y present that means this is color photography
    ii. else black&White photography
*/
