#include<bits/stdc++.h>
using namespace std;

int main()
{
    int test;
    cin>>test;

    for(int i=0; i<test; i++)
    {
        string s;
        cin>>s;

        int a=0, b=0;
        for(int j=0; j<5; j++)
        {
            if(s[j]=='A')
                a++;
            else
                b++;
        }
        if(a>b)
            cout<<"A"<<endl;
        else
            cout<<"B"<< endl;
    }
}
