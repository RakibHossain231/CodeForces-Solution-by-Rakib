#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t, a,b,c,n, temp, toEqual=0;
    cin>>t;
    while(t--)
    {
        cin>>a>>b>>c>>n;
        temp=max({a,b,c});
        toEqual= (temp-a)+(temp-b)+(temp-c);
        if(n>=toEqual)
        {
            if((n-toEqual)%3==0)
                cout<<"YES"<<endl;
            else
                cout<<"NO"<<endl;
        }
        else
            cout<<"NO"<<endl;

    }
    return 0;
}

/*
    i. find the maximum from a,b,c
    ii. prathomik vabe equal korar jnno maximum theke a,b,c minus kore jog korchi 1,2,4= 5 (1+3, 2+2, 4)
    iii. total n theke prathomik vabe ja lage minus kore ja thakbe ta jodi 3 vage equally vag kora jay
        tahole bolte parbo possible, if n=8, so, if(8-5)%3==0 then possible


*/
