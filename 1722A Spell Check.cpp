#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s="Timur";

    int n;
    cin>>n;

    for(int i=0; i<n; i++)
    {
        int length;
        cin>>length;
        fflush(stdin);
        string st;
        cin>>st;

        int missMatch=0;
        if(length>5) // Timur length is 5 that's why if more than 5, 100% sure no print
        {
            cout<<"NO"<<endl;
        }
        else
        {
            int c=0;
            for(int i=0; i<5; i++)
            {
                bool flag= false;
                for(int j=0; j<5; j++)
                {
                    if(s[i]==st[j])
                    {
                        st[j]='0';  // if match then replace for further check handle
                        flag= true;
                        break;
                    }
                }
                if(flag==false) // flag false means character does not match
                {
                    c=1;
                    break;
                }
            }
            if(c==0)  // finally c=0 means all character are matched
                cout<<"YES"<<endl;
            else
                cout<<"NO"<< endl;
        }
    }

    return 0;
}

