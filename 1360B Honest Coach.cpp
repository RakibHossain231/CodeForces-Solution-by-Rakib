#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t, n, temp;
    cin>>t;
    while(t--)
    {
        cin>>n;
        int arr[n];
        int mn= INT_MAX;
        for(int i=0; i<n; i++)
        {
            cin>>arr[i];
        }
        sort(arr, arr+n);

        for(int i=0; i<n-1; i++)
        {
            temp= arr[i+1]- arr[i];
            if(temp<mn)
                mn=temp;
        }
        cout<<mn<<endl;
    }
}

/*
    i. sort korchi
    ii. duita kore check dichi jar  subtract value kom, oita  store kore rakhchi
*/
