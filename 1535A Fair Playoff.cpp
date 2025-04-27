#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int a,b,c,d;
        cin>>a>>b>>c>>d;

        int max1=max(a, b);
        int max2= max(c,d);

        int min1= min(a, b);
        int min2= min(c, d);

        if(max1< min2 || max2<min1)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;

    }

    return 0;
}

/*
    i. if max of player a and b is smallest the min of player c and d
        also if max of player c and b is smallest the min of player a and b
        that means it is unfair
        like a=1 b=2 c=3 d=4 here is the final match will play b d but still c is greater than b
        like a=4 b=3 c=2 d=1 here is the final match will play a c but still b is greater than c
*/
