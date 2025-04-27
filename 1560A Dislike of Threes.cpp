#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int k;
        cin>>k;
        int total=0;
        for(int i=1; ; i++)
        {

            if(i%3!=0 && i%10!=3)
                total++;
            if(total==k)
            {
                cout<<i<<endl;
                break;
            }
        }
    }
    return 0;
}

/*
 i. jeigula 3 dara divisible and last digit 3 na tader count korchi then kth numbber ta print kore dichi
*/
