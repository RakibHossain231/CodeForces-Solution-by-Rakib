#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n, k;
    cin>>n>>k;

    int total=k;
    int problem=0;

    for(int i=1; i<=n; i++)
    {
        total+=(i*5);
        if(total<=240)
            problem++;
        else
            break;
    }

    cout<<problem<<endl;

    return 0;
}

/*
    rat 8 tay shuru hobe tahole 12 ta porjonto 4 hours means 240 minute tahole
    prottekta problem solve korar time jodi party te jawar time er sathe jog korar por 240 minute
    er kom hoy tahole solve korte parbo

    joto number problem tar sathe 5 gun korle ja asbe toto minute lagbe oi problem solve korte

*/
