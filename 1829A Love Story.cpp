#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s="codeforces";

    int n;
    cin>>n;
    fflush(stdin);

    for(int i=0; i<n; i++)
    {
        string st;
        cin>>st;
        int missMatch=0;
        for(int i=0; i<10; i++)  // duita string compare korchi just
        {
            if(s[i]!=st[i])
                missMatch++;
        }
        cout<<missMatch<<endl;
    }

    return 0;
}
