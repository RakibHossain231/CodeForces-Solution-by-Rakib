#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t, n, k;
    cin>>t;
    while(t--)
    {
        cin>>n>>k;
        vector<int> arr(n);
        for(int i=0; i<n; i++)
            cin>>arr[i];

        sort(arr.begin(), arr.end());

        if(binary_search( arr.begin(), arr.end(), k))
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
}


/*
    just k ta array er moddhe ache ni ta check dibo
    i. binary search use korar jnno sort kore nichi
    ii. then jodi khuje pay tahile true return korbe
*/
