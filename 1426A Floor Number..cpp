#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int clientFloor, floor;
        cin>>clientFloor>>floor;


        if(clientFloor<=2)
            cout<<1<<endl;
        else
        {
            int x= clientFloor-2;
            int result= ceil((float)x/floor);
            cout<<result+1<<endl;
        }
    }
    return 0;
}

/*
    if vasya apartment less or equal to 2 that means 1st floor
        else below
    i. vasya er apartments theke 1st floor er duita bad dibo
    ii. bad deyar por ja thakbe take each floor number diye divide korbo
    iii. divide er  round number nibo
    iv. round number er sathe 1 add korbo jehetu first floor bad dichi agei

*/
