#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin>>n;
        int count=0;
        while(n%6==0) // prothome 6 dara jotobar multiple hoy ta count kore nichi
        {
            count++;
            n=n/6;
        }

        while(n%3==0)  // n%3 deya karon hocche jeita 2 dara multiple korle 6 dara mod kore 0 ase ta count kora
        {
            n*=2;
            n/=6;
            count+=2;
        }
        if(n==1)
            cout<<count<<endl;
        else
            cout<<-1<<endl;
    }
    return 0;
}

/*
    for last while if n=2,4,5 then ami jodi 2 dara multiple kori lav nai, tai zeta 3 dara mod kora jay
    tare 2 dara multiple korle 6 darao mod kora jabe.
*/
