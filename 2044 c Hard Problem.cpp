
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int i=0; i<t; i++)
    {
        int m, a, b, c;
        cin >> m >> a >> b >> c;

        int row1= min(a, m);
        int row2= min(b, m);

        int rem_row1 = m - row1;
        int rem_row2 = m - row2;
        int no_pref = min(c, rem_row1 + rem_row2);

        cout << row1 + row2+ no_pref << endl;
    }

    return 0;
}

