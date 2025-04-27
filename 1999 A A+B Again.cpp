#include<bits/stdc++.h>
using namespace std;

int main()
{
    int test;
    cin>>test;

    int n, result;
    while(test!=0)
    {


        cin>>n;
        result=0;
        for(int i=0; i<2; i++)
        {
            int re=n%10;
            result= result+re;
            n=n/10;
        }
        cout<<result<<endl;
        test--;


    }



    return 0;
}
