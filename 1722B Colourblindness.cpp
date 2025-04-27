#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        string s1, s2;
        cin>>s1>>s2;

        bool flag = false;
        for(int i=0; i<n; i++)
        {
            if((s1[i]==s2[i]) || (s1[i]=='G' && s2[i]=='B') || (s1[i]=='B' && s2[i]=='G'))
            {
                continue;
            }
            else
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;
    }
    return 0;
}


/*
    Jehetu color blind that's why tar kache green and blue are the same color
    tai oi tuitake same hisebe treat kore dekhchi je duita row ee same kina.
    jodi same hoy tahole yes else no.

    code e jodi same na hoy tahole flag= true hobe
*/
