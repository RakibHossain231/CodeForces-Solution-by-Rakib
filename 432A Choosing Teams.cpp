#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n, k, temp;
    cin>>n>>k;
    int count=0;
    for(int i=0; i<n; i++)
    {
        cin>>temp;
        if(5-temp>=k)
            count++;
    }
    cout<<count/3<<endl;

    return 0;
}


/*
    mianly ber korte hobe je emon koyta team make kora jay jara k times eksathe contest korte parbe
    i. emon kauke khuje ber korbo jara 5 barer modhe k times ba ta cheye beshi time due ache contest
        e attend korar
    ii. tader ke 3 dara vag kore teams number pabo

*/
