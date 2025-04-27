#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int i=0; i<t; i++)
    {
        string s;
        cin>>s;

        int ln= s.length();
        string result="";
        for(int j=ln-1; j>=0; j--)
        {
            if(s[j]=='p')
                result+='q';
            else if(s[j]=='q')
                result+='p';
            else
                result+='w';

        }
        cout<<result<<endl;
    }


    return 0;
}

